# **Projeto Fuel Saver**
&gt; Desenvolvido para ajudar no cálculo de gasto de gasolina e litros necessários com base na distância, km/l e no preço atual.

## Descrição
O **Fuel Saver** permite ao usuário calcular o gasto de gasolina com base na distãncia, km/l e no preço atual.

## Funcionalidades
- [x] Entrada de dados (distância, kml e preço atual)
- [x] Cálculo do Gasto (litros necessários e custo da viagem)
- [x] Interface simples e intuitiva

## Tecnologias Utilizadas
- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **RelativeLayout** para interface responsiva
- [x] **TextView** e **EditText** para entrada e exibição de dados
      
## Como Rodar o Projeto
Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:
```bash
git clone https://github.com/Klaiancdrosa/Fuel-Saver.git
```
2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.
   
## Estrutura do Projeto
```bash
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java
| | | | |── br.ulbra.fuelsaver
│ │ │ │ | ├── MainActivity.java # Atividade principal com cálculo do gasto e litros necessários.
│ │ │ ├── res
| | | | ├── drawable # imagens e icones utilizados na tela principal
│ │ │ │ ├── layout
│ │ │ │ │ ├── activity_main.xml # Layout da tela principal
│ │ │ │ └── values
│ │ │ │ ├── strings.xml # Strings usadas no app
│ │ │ │ ├── colors.xml # Cores definidas no projeto
│ └── build.gradle # Configuração do Gradle
└── README.md # Este arquivo

## Design e Prototipage
A interface do app foi criada usando **RelativeLayout**;
O design é minimalista e fácil de usar, com foco na simplicidade.

## Telas do Aplicativo 1
**Tela Principal**
Na tela principal, o usuário insere seu o Nome do Veículo, Número da Placa, Distância (Km), Km/L que o carro gasta e o Valor do Combustível Atual.

![Saver 4](https://github.com/user-attachments/assets/d77b556c-186e-4f9c-96a0-1145532f6337)

## Desenvolvedores
**Klaian Conceição da Rosa** - Desenvolvedor - [GitHub](https://github.com/Klaiancdrosa)

## Licenças
Este projeto está licenciado sob os termos da licença MIT. Para mais detalhes, veja o arquivo
[LICENSE](LICENSE).
