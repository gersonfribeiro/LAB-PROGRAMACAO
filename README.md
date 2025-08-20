# 👋 Olá! Seja bem-vindo ao meu repositório para entrega de atividades!

#### 📚 Este repositório será utilizado para o envio das atividades resolvidas na disciplina de **Laboratório de programação** do curso de Ciência da Computação no **UNIFAGOC**, ministrado pelo professor: *Eduardo Luiz Feliciano Jr.*

---

<details>
  <summary><h2>📌 Atividade 1: Exercícios Práticos (Animais) - <em>Diretório: AnimalsClass</em></h2></summary>

## 🛠 Conceitos de POO com Java

Este projeto demonstra o uso prático de **POO** com Java.  
O objetivo é apresentar exemplos claros de como **criar**, **manipular**, **abastrair**, **implementar** e **consumir** os recursos proporcionados pelo paradigma.

---

### 📋 Estrutura dos Dados

A classe `AnimalsClass` define a estrutura de cada animal sendo a nossa classe abstrata:

```java
public abstract class AnimalsClass {
    private String name;
    private String song;
    private String color;
    Private Integer age;
    // Constructor, Getters and Setters 
    public abstract String emitSong();    
    public abstract String alterSong(String newSong);
}
```

## 🔭 3 Classes implementando a abstração

### 🧩 Classes

<table>
  <thead>
    <tr>
      <th>Nome da classe</th>
      <th>Nome setado no objeto</th>
      <th>Som setado</th>
      <th>Cor setada</th>
      <th>Idade setada</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>HorseClass</td>
      <td>Flash</td>
      <td>Relincho</td>
      <td>Brown</td>
      <td>12</td>
    </tr>
    <tr>
      <td>CatClass</td>
      <td>Garfield</td>
      <td>Miado</td>
      <td>orange</td>
      <td>46</td>
    </tr>
    <tr>
      <td>DogClass</td>
      <td>Max</td>
      <td>Latido</td>
      <td>white</td>
      <td>22</td>
    </tr>
  </tbody>
</table>

### 🧩 Funções Implementadas

#### ● Function1️⃣ emitSong() 
▶Mostra no console o nome do animal e o som emitido por ele.

#### ● Function2️⃣ alterSong(String newSong)
▶Mostra no console o nome do animal e informa que ele recebeu um novo som, faz a troca do valor e chama a função emitSong.

#### ● Function3️⃣ insertInCart(List<AnimalsClass> animals)
▶Mostra no console uma mensagem que o veterinário pegou algum animal e o inseriu na carrocinha para cada um dos elementos presentes no array.

</details>
