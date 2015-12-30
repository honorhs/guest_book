

$(function(){
  $('#modify').click(function(){
	  $('#id').val('');
	  $('.container').hide();
	  $('.container2').show();
    });
});

$(function(){
  $('#write').click(function(){
	 $('#id').val('');
	 $('.container2').hide();
     $('.container').show();	     
    });
});

$(function(){
	$('#btnValidate2').click(function() {
		var sEmail = $('#Email2').val();
		if (!validateEmail(sEmail)) {
			$('#message')[0].innerHTML = "이메일 형식 오류";
			$("#dialog-overlay").show();
			e.preventDefault();
		}
		if($('#id2').val().length>0){	
<<<<<<< HEAD:src/main/webapp/resources/js/common.js
			$('form[name=f_list]').attr('action','/app/update').submit();
=======
			$('form[name=f_list]').attr('action','/app/delete').submit();
>>>>>>> develop:src/main/webapp/resources/js/common.js
			$('#id2').val(0);
		}
		else{
			$('#id2').val(0);
			$('form[name=f_list]').attr('action','/app/m_list').submit();	
		}
	});
});

$(function(){
	$('#btnValidate').click(function() {
		var sEmail = $('#Email').val();
		if (!validateEmail(sEmail)) {
			$('#message')[0].innerHTML = "이메일 형식 오류";
			 $("#dialog-overlay").show();
			e.preventDefault();
		}
		if($('#id').val().length>0){
			
			$('form[name=f_write]').attr('action','/app/update').submit();
			$('#id').val(0);
		}
		else{
			$('#id').val(0);
			$('form[name=f_write]').attr('action','/app/write').submit();	
		}
	});
});


function validateEmail(sEmail) {
	var filter = /^([a-z\d!#$%&'*+\-\/=?^_`{|}~\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]+(\.[a-z\d!#$%&'*+\-\/=?^_`{|}~\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]+)*|"((([ \t]*\r\n)?[ \t]+)?([\x01-\x08\x0b\x0c\x0e-\x1f\x7f\x21\x23-\x5b\x5d-\x7e\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]|\\[\x01-\x09\x0b\x0c\x0d-\x7f\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]))*(([ \t]*\r\n)?[ \t]+)?")@(([a-z\d\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]|[a-z\d\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF][a-z\d\-._~\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]*[a-z\d\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])\.)+([a-z\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]|[a-z\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF][a-z\d\-._~\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]*[a-z\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])\.?$/i;
	if (filter.test(sEmail)) {
		return true;
	}
	else {
		return false;
	}
}


$(function(){
	$('.lists').hover(
		function(){
			$('.custom_box').show();
		},
		function(){
			$('.custom_box').hide();
		}
	);
	$('.custom_box').hover(
			function(){
				$('.custom_box').show();
			},
			function(){
				$('.custom_box').hide();
			}
		);
});

$(function(){
	$('.c_box2').click(function() {
		var data = $(this).siblings('#idx_num').val();
		var f_parent = $(this).parent().parent();
		var email_addr = f_parent.find('h2')[0].innerText;
		
		$('#Email2').val(email_addr);
		$('#id2').val(data);
		$('.container2').show();	
	});
});

$(function(){
	$('.c_box').click(function() {
		$('.container2').hide();	
		var data = $(this).siblings('#idx_num').val();
		var f_parent = $(this).parent().parent();
		var email_addr = f_parent.find('h2')[0].innerText;
		var context = f_parent.find('p')[1].innerText;
		
		$('#Email').val(email_addr);
		$('#Context').val(context);
		$('#id').val(data);
		$('.container').show();	
		
	});
});

$(function(){
	$('#dialog-overlay').click(function() {
		$('#dialog-overlay').hide();
	});
});

$(document).ready(function() {
	 if($('#message')[0].innerHTML){
		 $("#dialog-overlay").show();
	 }
	 else{
		 $("#dialog-overlay").hide();
	 }
<<<<<<< HEAD:src/main/webapp/resources/js/common.js
=======
     $("#search2").bind("keydown", function(e) {
         if (e.keyCode == 13) { // enter key
        	 $('form[name=search3]').attr('action','/app/search_bar').submit();	
         }
     })
>>>>>>> develop:src/main/webapp/resources/js/common.js
});
