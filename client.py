#Importar biblioteca
import xmlrpc.client
import socket
#Definir servidor
s = xmlrpc.client.ServerProxy('http://10.0.203.76:21212')
d = xmlrpc.client.ServerProxy('http://10.0.84.194:21212')

#Chamar funções disponíveis no servidor
s.armazenar("Gatinho manhoso")
s.armazenar("Gatinho gaiato")
print(d.reverse("Yag e ecov"))

print(s.getMensagens())
print(s.pegarIp())
print(s.pegarDataHora())

