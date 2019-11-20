$(document).ready(function(){
        $.ajax({
            type : "POST",
            url : "alarm.jsp",
            dataType : "html",
            error : function(){
                alert("통신실패!!!!");
            },
            success : function(result){
                $("div").html(result);
                alert("통신 데이터 값 : " + result);
            }
        });
    });


var AlarmManager = new function(){
    var interval    = 500;
    var xmlHttp     = new XMLHttpRequest();
    xmlHttp.open("POST", "alarm.jsp");
    
    // Ajax Setting
    xmlHttp.onreadystatechange = function(){
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200){
            res = JSON.parse(xmlHttp.responseText);
            AlarmManager.show(res.data);
        }
    }

    // 채팅내용 가져오기
    this.proc = function()

    {

        // Ajax 통신

        xmlHttp.open("GET", "proc.php?date=" + finalDate, true);

        xmlHttp.send();

    }

 

    // 채팅내용 보여주기

    this.show = function(data)

    {

        var o = document.getElementById('list');

        var dt, dd;

 

        // 채팅내용 추가

        for(var i=0; i<data.length; i++)

        {

            dt = document.createElement('dt');

            dt.appendChild(document.createTextNode(data[i].name));

            o.appendChild(dt);

 

            dd = document.createElement('dd');

            dd.appendChild(document.createTextNode(data[i].msg));

            o.appendChild(dd);

        }

    }

 

    // interval에서 지정한 시간마다 실행

    setInterval(this.proc, interval);

}
