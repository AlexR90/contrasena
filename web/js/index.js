$(document).ready(function()
      {
         $("#mostrarmodal").modal("show");
      });

$('.form').find('input, textarea').on('keyup blur focus', function (e) {
  
  var $this = $(this),
      label = $this.prev('label');

	  if (e.type === 'keyup') {
			if ($this.val() === '') {
          label.removeClass('active highlight');
        } else {
          label.addClass('active highlight');
        }
    } else if (e.type === 'blur') {
    	if( $this.val() === '' ) {
    		label.removeClass('active highlight'); 
			} else {
		    label.removeClass('highlight');   
			}   
    } else if (e.type === 'focus') {
      
      if( $this.val() === '' ) {
    		label.removeClass('highlight'); 
			} 
      else if( $this.val() !== '' ) {
		    label.addClass('highlight');
			}
    }

});

$('.tab a').on('click', function (e) {
  
  e.preventDefault();
  
  $(this).parent().addClass('active');
  $(this).parent().siblings().removeClass('active');
  
  target = $(this).attr('href');

  $('.tab-content > div').not(target).hide();
  
  $(target).fadeIn(600);
  
});
var abrirpopup = document.getElementById('abrirmodal'),
        overlay = document.getElementById('overlay'),
        popup = document.getElementById('popup'),
        cerrarpopup = document.getElementById('btn-cerrarpopup');

abrirpopup.addEventListener('click', function(){
    overlay.classList.add('active');
    popup.classList.add('active');
});
cerrarpopup.addEventListener('click', function(){
    overlay.classList.remove('active');
    popup.classList.remove('active');
});

const validarnumero = (evt) =>{
    
    if(window.event){
        keynum = evt.keyCode;
    }else{
        keynum = evt.which;
    }
    
    if((keynum > 47 && keynum < 58)||keynum === 8 || keynum === 13 ){
        return true;
    }else{
        return false;
    }
};