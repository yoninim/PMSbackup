var xhttp;

function createXMLRequest() {
   xhttp = new XMLHttpRequest();
}

window.onload = function(){
   
   var pushalarm = document.getElementByID("pushAlarm");
   var divalarm = document.getElementsByTagName("div");
   
   alarm(function(item) {
       item.addEventListener("click", function() {
         var mid = this.id;
         // 멤버 아이디값 까지 전송 완료 
         
         var numput = document.getElementById("cnum");
         numput.value = mid;
       });
     });
     
     function createAlarm() {
		if(xhttp.readyState == 4){
			if(xhttp.status == 200){
				
			}else{
				alert("failed alarm")
			}
		}
	}

     function sendRequest() {
    	createXMLRequest();
        
        xhttp.onreadystatechange = createAlarm;
        xhttp.open("GET", "todoAlarm.do");
        var postMethod = "name=" + inputName.value;
        
        xhttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        xhttp.send();
     }
     
     modalBtn.onclick = function(event) {
        event.preventDefault();
        
        // 전송할 요청과 받을 요청
        sendRequest();
     }
}

function clickNo() {
    var a = this.innerHTML;
    var numput = document.getElementById("cnum");
    numput.value = a;
  }