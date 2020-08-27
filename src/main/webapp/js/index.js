var myChart = echarts.init(document.getElementById('main'));

var option = {
    title: {
        sublink: 'http://esa.un.org/wpp/Excel-Data/population.htm',
        left: 'center',
        top: 'top'
    },
    visualMap: {
        min: 0,
        max: 50000,
        text:['High','Low'],
        realtime: false,
        calculable: true,
        color: ['orangered','yellow','lightskyblue']
    },
    series: [
        {
            name: '全球新冠肺炎现有确诊数量分布图',
            type: 'map',
            mapType: 'world',
            roam: true,
            itemStyle:{
                emphasis:{label:{show:true}}
            },
        }
    ]
};


function loadData(option){
    $.ajax({
        type : 'GET',
        url : '/covid/country/findAll',
        dataType: 'JSON',
        async : 'false',
        beforeSend:function(){
            myChart.setOption(option);
            myChart.showLoading();
        },
        success:function (response) {
            var dataset = {};
            option.series[0].data = [];
            $.each(response,function (index,val) {
                var dic = {};
                var items = {};
                items['todayConfirm'] = val.todayConfirm;
                items['todaySuspect'] = val.todaySuspect;
                items['todayHeal'] = val.todayHeal;
                items['todayDead'] = val.todayDead;
                items['totalConfirm'] = val.totalConfirm;
                items['totalSuspect'] = val.totalSuspect;
                items['totalHeal'] = val.totalHeal;
                items['totalDead'] = val.totalDead;
                items['nowConfirm'] = val.nowConfirm;
                dic['name'] = val.name;
                dic['value'] = val.nowConfirm;
                dataset[val.name] = items;
                option.series[0].data.push(dic);
            });
            myChart.setOption(option);
            myChart.setOption({
                tooltip: {
                    trigger: 'item',
                    formatter: function (params) {
                        var s =  params['data']['name'] + "<br/>"
                            + '今日确诊:' + dataset[params['data']['name']]['todayConfirm'] + "<br/>"
                            + '今日疑似:' + dataset[params['data']['name']]['todaySuspect'] + "<br/>"
                            + '今日治愈:' + dataset[params['data']['name']]['todayHeal'] + "<br/>"
                            + '今日死亡:' + dataset[params['data']['name']]['todayDead'] + "<br/>"
                            + '累计确诊:' + dataset[params['data']['name']]['totalConfirm'] + "<br/>"
                            + '累计疑似:' + dataset[params['data']['name']]['totalSuspect'] + "<br/>"
                            + '累计治愈:' + dataset[params['data']['name']]['totalHeal'] + "<br/>"
                            + '累计死亡:' + dataset[params['data']['name']]['totalDead'] + "<br/>"
                            + '现有确诊:' + dataset[params['data']['name']]['nowConfirm'] + "<br/>";
                        return s;
                    }
                }
            });
            myChart.hideLoading();
        },
        error:function () {
            console.log("error");
        }
    });
}
loadData(option);
