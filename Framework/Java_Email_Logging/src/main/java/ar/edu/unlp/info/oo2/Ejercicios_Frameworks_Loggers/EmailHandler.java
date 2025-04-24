package ar.edu.unlp.info.oo2.Ejercicios_Frameworks_Loggers;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class EmailHandler extends Handler{

	@Override
	public void publish(LogRecord record) {
		String mensajeLog = record.getMessage();
		try {
			String from = "example@logger.com";
			String to = "destination@mail.com";

			// credenciales
			String username = "c2bc0d934273d1"; // Completar con su username de mailtrap
			String password = "51d937a6997fcb"; // Completar con su password de mailtrap
			
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.mailtrap.io");
			props.put("mail.smtp.port", "587");				 
			Session session = Session.getInstance(props,
				new Authenticator() {
		            protected PasswordAuthentication getPasswordAuthentication() {
		            	return new PasswordAuthentication(username, password);
		            }
			});

		    Message message = new MimeMessage(session);
		    message.setFrom(new InternetAddress(from, "Java logging mail"));
		    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		    message.setSubject("Log de OO2");
		    message.setText(mensajeLog);
		    Transport.send(message);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
	    }
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws SecurityException {
		// TODO Auto-generated method stub
		
	}

}
