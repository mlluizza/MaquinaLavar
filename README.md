# Simulador de Máquina de Lavar em Java (Controle de Estados)

## Maria Luiza e Mariana Borges Fanhani
  
## 1. Descrição do Projeto
Este projeto foi desenvolvido em **Java** para modelar e controlar o funcionamento de uma máquina de lavar roupas baseada em uma máquina de estados finitos. O sistema gerencia rigorosamente as operações permitidas de acordo com o estado atual da máquina e as condições físicas simuladas, como a abertura ou o fechamento da tampa.

## 2. Objetivo
Aplicar conceitos de Programação Orientada a Objetos (POO), encapsulamento, validação de regras de negócio e controle de fluxo/estados em Java, garantindo que operações inválidas sejam bloqueadas e tratadas com segurança durante todo o ciclo de funcionamento.

## 3. Funcionalidades e Comportamentos
A classe `MaquinaDeLavar` implementa os seguintes comportamentos:
* Ligar a máquina (`ligar`)
* Desligar a máquina (`desligar`)
* Iniciar a lavagem (`iniciarLavagem`)
* Pausar a lavagem (`pausarLavagem`)
* Retomar a lavagem (`retomarLavagem`)
* Iniciar a centrifugação (`iniciarCentrifugacao`)
* Abrir a tampa (`abrirTampa`)
* Fechar a tampa (`fecharTampa`)

## 4. Regras de Negócio e Restrições
O sistema valida restrições rígidas para assegurar a integridade do ciclo:
1. Uma máquina desligada **não pode iniciar** uma lavagem.
2. A lavagem **só pode ser iniciada** com a tampa fechada.
3. A tampa **não pode ser aberta** enquanto a máquina estiver lavando ou centrifugando.
4. Uma máquina desligada **não pode ser pausada**.
5. Uma lavagem pausada **pode ser retomada**.
6. A centrifugação **só pode ser iniciada** depois que a lavagem estiver concluída.
7. A máquina **não pode ser desligada** enquanto estiver lavando ou centrifugando.
8. Depois de concluída a centrifugação, a máquina **pode ser desligada**.
9. Uma máquina que já está ligada **não deve ser ligada** novamente.
10. Uma máquina que já está desligada **não deve ser desligada** novamente.
