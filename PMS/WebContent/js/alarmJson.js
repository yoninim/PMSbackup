function todoAlarm(card_Name) {
	$.ajax({
		data : {list : card_Name},
		type : "POST",
		url : "../alarm.jsp",
		cache : false,
		contentType : false,
		processData : false,
		success : function(data) {
			alaert(data.result);
		}
	})
}