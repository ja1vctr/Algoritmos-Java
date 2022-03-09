
def funcoes():
    print("Escreva um algoritmo para ler o número total de votos dos eleitores de um município, o número de votos brancos, nulos e válidos. \nCalcular e escrever o percentual que cada um representa em relação ao total de eleitores.\n\n")

    total_eleitores = int(
        input("Digite a quantidade de eleitores existentes na cidade: "))
    validos = int(input("Digite a quantidade de votos válidos: "))
    nulos = int(input("Digite a quantidade de votos nulos: "))
    brancos = int(input("Digite a quantidade de votos brancos: "))

    votos_totais = validos + nulos + brancos

    lista_de_valores = [votos_totais, validos, nulos, brancos]

    def opcoes():
        print("(1) Percntual de eleitores que votaram")
        print("(2) Percntual de votos validos")
        print("(3) Percentual de votos nulos")
        print("(4) Percentual de votos brancos")

    def escolha():
        opcoes()
        try:
            escolha = int(input("Qual informação você quer saber? "))

        except (ValueError):
            print(f"O erro foi cometido por: {ValueError}")
            print("Vc precisa digitar os numeros correspondetes a cada opcão.")
            print("tente novamente!\n")

            opcoes()
            escolha = int(input("Qual informação você quer saber?"))

        except KeyboardInterrupt:
            print("A operação foi interrompida pelo usuário.")
        else:
            for i in range(5):
                if i == escolha:
                    if escolha == 1:
                        resultado = (lista_de_valores[i]/total_eleitores)*100
                        print(
                            f"A opção escolhida foi: ({i})\n E oresultado é: {resultado} por cento")
                    else:
                        resultado = (lista_de_valores[i]/votos_totais)*100
                        print(
                            f"A opção escolhida foi: ({i})\nOresultado é: {resultado} por cento")
    escolha()

    print("Final da pesquisa!\n")
    print("O que você gostaria de fazer agora?")
    print("(1) Reefazer a pesquisa")
    print("(2) Voltar ao menu")
    decisao = int(input("Digite a opção desejada"))
    if decisao == 1:
        pass
    if decisao == 2:
        pass
    else:
        print("Opção Inválida!")


if (__name__ == "__main__"):
    funcoes()
