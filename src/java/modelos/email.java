/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Calendar;
import java.util.Properties;
import java.util.Random;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;





public class email {

    private final String remitente = "pruebacontrasena20";
       
public boolean enviarcorreo (String correo,String codigo){
    

    String asunto = "Recuperar Password";
    String cuerpo = "Su codigo de recuperacion de contraseña es: "+ codigo;
    
    Properties props = new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
    props.put("mail.smtp.user", remitente);//remitente
    props.put("mail.smtp.clave", "Contrasena.20");    //La clave de la cuenta
    props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
    props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
    props.put("mail.smtp.port", "587");
    
    Session session = Session.getDefaultInstance(props);
    MimeMessage message = new MimeMessage(session);
    
    try {
        message.setFrom(new InternetAddress(remitente));
        message.addRecipients(Message.RecipientType.TO, correo);  //Se podrían añadir varios de la misma manera
        message.setSubject(asunto);
        message.setText(cuerpo);
        Transport transport = session.getTransport("smtp");
        transport.connect("smtp.gmail.com", remitente,"Contrasena.20");
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
        System.out.println(cuerpo);
        return true;
    }
    catch (MessagingException me) {
        me.printStackTrace();   //Si se produce un error
    }
    
    return false;
    
}

 public String codigo(){
             Random aleatorio = new Random();

            String alfa = "ABCDEFGHIJKLMNOPQRSTVWXYZ";

            String cadena = "";    //Inicializamos la Variable//

            int numero;

            int forma;
             //Método para el Cálculo de Código//

            forma=(int)(aleatorio.nextDouble() * alfa.length()-1+0);

            //Definimos la cantidad máxima de números aleatorios (99) y sumamos 100 para mantener 3 números cada vez//

            numero=(int)(aleatorio.nextDouble() * 99+100);

            
       Calendar calendario = Calendar.getInstance();
        
       int dia = calendario.get(Calendar.DAY_OF_MONTH);
       int segundo = calendario.get(Calendar.SECOND);
       
     cadena=cadena+alfa.charAt(forma)+numero+Integer.toString(dia)+Integer.toString(segundo);
         
    return cadena;
    }
 
 public boolean mastermail(int nit){
     consultas cons = new consultas();
     email send = new email();
     String codigo =null;
     codigo = send.codigo();
     
     String correo = cons.recuperarpass(nit);
     System.out.println(codigo);
     
     if(cons.insertcodigo(nit,codigo )){
         System.out.println(codigo);
           boolean check = send.enviarcorreo(correo, codigo);
           System.out.println(codigo);
     if(check){
         System.out.println("EXITO");
         return true;
     }
     }
     
     
 return false;
 }


    

}
/*private static void enviarConGMail(String destinatario, String asunto, String cuerpo) {
    // Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el remitente también.
    private String remitente = "nomcuenta";  //Para la dirección nomcuenta@gmail.com

    Properties props = System.getProperties();
    props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
    props.put("mail.smtp.user", remitente);
    props.put("mail.smtp.clave", "miClaveDeGMail");    //La clave de la cuenta
    props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
    props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
    props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google

    Session session = Session.getDefaultInstance(props);
    MimeMessage message = new MimeMessage(session);

    try {
        message.setFrom(new InternetAddress(remitente));
        message.addRecipient(Message.RecipientType.TO, destinatario);   //Se podrían añadir varios de la misma manera
        message.setSubject(asunto);
        message.setText(cuerpo);
        Transport transport = session.getTransport("smtp");
        transport.connect("smtp.gmail.com", remitente, clave);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
    catch (MessagingException me) {
        me.printStackTrace();   //Si se produce un error
    }
}*/