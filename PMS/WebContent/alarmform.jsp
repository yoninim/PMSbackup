<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>알람</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:400,500,600"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style>
body {
	font-family: 'Open Sans';
}
</style>
<link href="css/light-theme.min.css" rel="stylesheet">
<link href="css/dark-theme.min.css" rel="stylesheet">
<link href="css/colored-theme.min.css" rel="stylesheet">
<script type="text/javascript" src="js/growl-notification.min.js">
	
</script>
</head>
</head>
<body>
	<div class="row">
		<div class="col-lg-6">
			<button id="show-notification-default-success"
				class="btn btn-outline-success">Show me a notification
				(Success)</button>
			<pre class="mt-4"></pre>
		</div>
	</div>
	<div class="row mt-4">
		<div class="col-lg-6">
			<button id="show-notification-default-error"
				class="btn btn-outline-danger">Show me a notification
				(Error)</button>
			<pre class="mt-4"></pre>
		</div>
	</div>
	<div class="col-lg-6">
		<button id="show-notification-default-warning"
			class="btn btn-outline-warning">Show me a notification
			(Warning)</button>
		<pre class="mt-4"></pre>
	</div>
	<div class="row mt-4">
		<div class="col-lg-6">
			<button id="show-notification-default-info"
				class="btn btn-outline-purple">Show me a notification
				(Info)</button>
			<pre class="mt-4"></pre>
		</div>
	</div>
</body>
<script type="text/javascript">
    GrowlNotification.setGlobalOptions({
        buttons: {
            action: {
                text: 'Apply'
            },
            cancel: {
                text: 'Dismiss'
            }
        }
    });

    function getOptions() {
        var position = $('#notification-position').val();
        var closeTimeout = $('#close-timeout').val();
        var animation = $('#animation').val();
        var showButtons = $('#show-buttons').get(0).checked;
        var showProgressBar = $('#show-progress-bar').get(0).checked;
        var animationOptions = {
            open: animation + '-in',
            close: animation + '-out'
        };

        if (animation === 'none') {
            animationOptions = {
                open: false,
                close: false
            };
        }

        return options = {
            description: 'I am a default notification',
            position: position,
            closeTimeout: closeTimeout,
            closeWith: ['click'],
            animation: animationOptions,
            showButtons: showButtons,
            buttons: {
                action: {
                    callback: function (notification) {
                        console.log('action button');
                    }
                }
            },
            showProgress: showProgressBar
        };
    }

    $('#show-notification-default-simple').on('click', function () {
        GrowlNotification.notify(getOptions());
    });

    $('#show-notification-default-alert').on('click', function () {
        var options = getOptions();
        options.title = 'Hello!';
        options.description = 'I am a default notification. I am a default notification. I am a default notification. I am a default notification.';
        options.width = 500;
        GrowlNotification.notify(options);
    });

    $('#show-notification-default-success').on('click', function () {
        var options = getOptions();
        options.title = 'Well Done!';
        options.description = 'You just submit your resume successfully.';
        options.type = 'success';
        GrowlNotification.notify(options);
    });

    $('#show-notification-default-error').on('click', function () {
        var options = getOptions();
        options.title = 'Warning!';
        options.description = 'The data presentation here can be change.';
        options.type = 'error'; // or danger
        GrowlNotification.notify(options);
    });

    $('#show-notification-default-warning').on('click', function () {
        var options = getOptions();
        options.title = 'Reminder!';
        options.description = 'You have a meeting at 10:30 АМ';
        options.type = 'warning';
        GrowlNotification.notify(options);
    });

    $('#show-notification-default-info').on('click', function () {
        var options = getOptions();
        options.title = 'Sorry!';
        options.description = 'Could not complete your transaction.';
        options.type = 'info';
        //options.image = 'img/info.png';
        options.image = {
            visible: true
        };
        GrowlNotification.notify(options);
    });

    $('#show-notification-icon-alert').on('click', function () {
        var options = getOptions();
        options.title = 'Hello!';
        options.description = 'I am a default notification.';
        //options.image = 'img/default.png';
        options.image = {
            visible: true
        };
        GrowlNotification.notify(options);
    });

    $('#show-notification-icon-success').on('click', function () {
        var options = getOptions();
        options.title = 'Well Done!';
        options.description = 'You just submit your resume successfully.';
        //options.image = 'img/success.png';
        options.image = {
            visible: true
        };
        options.type = 'success';
        GrowlNotification.notify(options);
    });

    $('#show-notification-icon-error').on('click', function () {
        var options = getOptions();
        options.title = 'Warning!';
        options.description = 'The data presentation here can be change.';
        //options.image = 'img/danger.png';
        options.image = {
            visible: true
        };
        options.type = 'danger';
        GrowlNotification.notify(options);
    });

    $('#show-notification-icon-warning').on('click', function () {
        var options = getOptions();
        options.title = 'Reminder!';
        options.description = 'You have a meeting at 10:30 АМ';
        //options.image = 'img/warning.png';
        options.image = {
            visible: true
        };
        options.type = 'warning';
        GrowlNotification.notify(options);
    });

    $('#show-notification-icon-info').on('click', function () {
        var options = getOptions();
        options.title = 'Sorry!';
        options.description = 'Could not complete your transaction.';
        options.image = {
            visible: true
        };
        options.type = 'info';

        GrowlNotification.notify(options);
    });

    $('#show-notification-close-all').on('click', function () {
        GrowlNotification.closeAll();
    });


</script>
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-46156385-1', 'cssscript.com');
  ga('send', 'pageview');

</html>