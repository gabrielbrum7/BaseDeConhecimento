#!/usr/bin/env python
#coding: utf8 
import os
#import sys
import sys
reload(sys)
sys.setdefaultencoding("utf-8")
import requests

arg = sys.argv[1]

url = 'https://suportevendasb2w.zendesk.com/api/v2/views/'+arg+'/tickets.json'
user = 'gabriel.brum@ideais.com.br'
pwd = 'metropoliszendesk'

response = requests.get(url, auth=(user, pwd))

data = response.json()

totalTickets = (data["count"])

for item in range(0, totalTickets):

	ticket = str(data["tickets"][item]["id"])

	url2 = 'https://suportevendasb2w.zendesk.com/api/v2/tickets/'+ticket+'.json'
	response2 = requests.get(url2, auth=(user, pwd))
	data2 = response2.json()

	print 'ID: '                +str(data2["ticket"]["id"])
	print 'ID do solicitante: ' +str(data2["ticket"]["requester_id"])
	print 'ID do atribuído: '   +str(data2["ticket"]["assignee_id"])
	print 'Título do chamado: ' +str(data2["ticket"]["subject"])
	print 'Marca: '             +str(data2["ticket"]["custom_fields"][0]["value"])

	print '\n'









