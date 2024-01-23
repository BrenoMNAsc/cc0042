import datetime
from xmlrpc.server import SimpleXMLRPCServer
from xmlrpc.server import SimpleXMLRPCRequestHandler


# Registrar caminho para o servidor
class RequestHandler(SimpleXMLRPCRequestHandler):
    rpc_paths = ('/RPC2',)

ip = '10.0.203.76'
# Create server
with SimpleXMLRPCServer(('10.0.203.76', 21212), requestHandler=RequestHandler) as server:
    server.register_introspection_functions()

    # Definição de funções

    mensagens = []


    def armazenar(mensagem):
        mensagens.append(mensagem)
        return (True)


    def getMensagens():
        return (mensagens)


    def getIp():
        return ip

    def getDateHour():
        return datetime.datetime.now()


    # Registrar funções
    server.register_function(getDateHour, 'pegarDataHora')
    server.register_function(armazenar, 'armazenar')
    server.register_function(getMensagens, 'getMensagens')
    server.register_function(getIp, "pegarIp")

    # Iniciar servidor
    server.serve_forever()
