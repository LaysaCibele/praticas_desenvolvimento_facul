from abc import ABC, abstractmethod

class Pessoa(ABC):
    def __init__(self, nome):
        self.nome = nome

    @abstractmethod
    def exibir_tipo(self):
        pass


class Cliente(Pessoa):
    def __init__(self, nome, email):
        super().__init__(nome)
        self.email = email

    def exibir_tipo(self):
        return f"{self.nome} é um cliente."


class Funcionario(Pessoa):
    def __init__(self, nome, cargo):
        super().__init__(nome)
        self.cargo = cargo

    def exibir_tipo(self):
        return f"{self.nome} é funcionário ({self.cargo})."


class Conta:
    def __init__(self, saldo):
        self._saldo = saldo

    def ver_saldo(self):
        return self._saldo

    def depositar(self, valor):
        if valor > 0:
            self._saldo += valor

    def sacar(self, valor):
        if valor <= self._saldo:
            self._saldo -= valor
        else:
            print("Saldo insuficiente!")


class MetodoPagamento:
    def pagar(self, valor):
        pass


class Pix(MetodoPagamento):
    def pagar(self, valor):
        return f"Pagamento de R${valor} via PIX realizado."


class Cartao(MetodoPagamento):
    def pagar(self, valor):
        return f"Pagamento de R${valor} no cartão realizado."


class Pedido:
    def __init__(self, cliente, valor):
        self.cliente = cliente
        self.valor = valor
        self.status = "Pendente"

    def confirmar(self):
        self.status = "Confirmado"

    def cancelar(self):
        self.status = "Cancelado"

    def pagar(self, metodo_pagamento):
        resultado = metodo_pagamento.pagar(self.valor)
        self.status = "Pago"
        return resultado


cliente1 = Cliente("Laysa", "laysa@email.com")

conta = Conta(1000)
conta.sacar(200)
print("Saldo atual:", conta.ver_saldo())

pedido = Pedido(cliente1, 150)

pedido.confirmar()
print("Status do pedido:", pedido.status)

pix = Pix()
print(pedido.pagar(pix))

cartao = Cartao()
print(pedido.pagar(cartao))

print(cliente1.exibir_tipo())