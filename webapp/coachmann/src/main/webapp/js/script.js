// JavaScript e-uctenky

function resize() {
	var height = document.getElementById('body').offsetHeight - 350;
	document.getElementById('main').style.minHeight = height + 'px';

};

function socdoc() {

	var a = window.innerHeight - 350;
	document.getElementById('social').style.height = a + 'px';

	var left = ((document.getElementById('body').offsetWidth - document
			.getElementById('main').offsetWidth) / 2)
			+ document.getElementById('main').offsetWidth;

	document.getElementById('social').style.left = left + 'px';
};

$(document).ready(

function() {
	document.getElementById('content').style.height = '168px';
	window.onresize = resize();

	$('#social li').hover(
	// on mouse over move to right
	function() {
		$(this).stop().animate({
			marginLeft : '0px'
		}, 200);

	}, function() {
		$(this).stop().animate({
			marginLeft : '-5px'
		}, 200);
	}

	);

	$(window).scroll(function() {
		var y = $(window).scrollTop(); // scroll pozice do proměnné

		if (y >= 100) {
			$('#social').addClass('fixed');
		} else {
			$('#social').removeClass('fixed');
		}

	});

	$('#euctenky').hover(

	function() {
		document.getElementById('submenu').style.display = "block";
		$('#submenu').stop().animate({
			opacity : '1'
		}, 400);

	}, function() {
		$('#submenu').stop().animate({
			opacity : '0'
		}, 400, function() {
			document.getElementById('submenu').style.display = "none";
		});

	}

	);

	$('#reg').click(

	function() {
		if (document.getElementById('content').offsetHeight < 400) {
			$('.bluebox_text').stop().animate({
				height : '400'
			}, 600);
			$('#reg_content').stop().delay(400).animate({
				opacity : '1'
			}, 600);
		} else {
			$('.bluebox_text').stop().delay(400).animate({
				height : '168'
			}, 800);
			$('#reg_content').stop().animate({
				opacity : '0'
			}, 800);

		}
	});

	// WHISPER LOG
	$('.user_symbol').hover(

	function() {

		var id = $(this).attr('id');
		var send;
		switch (id) {
		case 'call_1':
			send = "#whisper_1";
			whisper_show(send);
			break;
		case 'call_2':
			send = "#whisper_2";
			whisper_show(send);
			break;
		case 'call_3':
			send = "#whisper_3";
			whisper_show(send);
			break;
		}

	}, function() {
		var id = $(this).attr('id');
		var send;
		switch (id) {
		case 'call_1':
			send = "#whisper_1";
			whisper_hide(send);
			break;
		case 'call_2':
			send = "#whisper_2";
			whisper_hide(send);
			break;
		case 'call_3':
			send = "#whisper_3";
			whisper_hide(send);
			break;
		}

	}

	);

	function whisper_show(id) {

		$(id).css("display", "block");
		$(id).stop().animate({
			opacity : '1'
		}, 600);

	}

	function whisper_hide(id) {
		$(id).stop().animate({
			opacity : '0'
		}, 600, function() {
			$(id).css("display", "none");
		});

	}

});

function show(id) {

	$(id).stop().animate({
		opacity : '1'
	}, 800);
}

function hide(id) {

	$(id).stop().animate({
		opacity : '0'
	}, 600);
}

function entSub(e, entForm) {

	e = e || window.event || {};
	var charCode = e.charCode || e.keyCode || e.which;

	if (charCode == 13) {
		entForm.submit();
	} else {
		return true;
	}
}
