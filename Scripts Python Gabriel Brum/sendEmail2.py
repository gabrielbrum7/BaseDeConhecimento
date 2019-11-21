#!/usr/bin/python
import smtplib

SMTP_SERVER = 'smtp.gmail.com'
SMTP_PORT = 587
 
sender = 'gabriel.brum@ideais.com.br'
password = 'senha'

recipient = ['bernardo.franco@ideais.com.br', 'jeferson.farias@ideais.com.br', 'luciano.baiense@ideais.com.br', 'aluan.costa@ideais.com.br', 'mauricio.araujo@ideais.com.br', 'monique.lemos@ideais.com.br', 'marcus.assis@ideais.com.br', 'alexandre.coimbra@ideais.com.br', 'service.desk@ideais.com.br']


from datetime import date
data = date.today()
subject = 'Report Ongoing Diario - N1 - ' + '['+str(data.day)+'-'+str(data.month)+'-'+str(data.year)+']'
file = open ('email.txt')

body = 'Boa noite,<br><br>Segue status do dia:<br><br>'+ str(file.read())+'<br><br>Atenciosamente.'

body = "" + body + ""

headers = ["From: " + sender,
       	   "Subject: " + subject,
       	   "To: bernardo.franco@ideais.com.br, jeferson.farias@ideais.com.br, luciano.baiense@ideais.com.br, aluan.costa@ideais.com.br, mauricio.araujo@ideais.com.br, monique.lemos@ideais.com.br, marcus.assis@ideais.com.br, alexandre.coimbra@ideais.com.br, service.desk@ideais.com.br",
       	   "MIME-Version: 1.0",
       	   "Content-Type: text/html"]
headers = "\r\n".join(headers)
 
session = smtplib.SMTP(SMTP_SERVER, SMTP_PORT)
 
session.ehlo()
session.starttls()
session.ehlo
session.login(sender, password)
session.sendmail(sender, recipient, headers + "\r\n\r\n" + body)
session.quit()
