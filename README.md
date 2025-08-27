# 👋 Olá! Seja bem-vindo ao meu repositório para entrega de atividades!

#### 📚 Este repositório será utilizado para o envio das atividades resolvidas na disciplina de **Laboratório de programação** do curso de Ciência da Computação no **UNIFAGOC**, ministrado pelo professor: *Eduardo Luiz Feliciano Jr.*

---

<details>
  <summary><h2>📌 Atv. 1: Exercícios Práticos (Animais) - <em>Dir.: AnimalsClass</em></h2></summary>

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
    private Integer age;
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

<details>
  <summary><h2>📌 Atv. 2: Gerencia de Biblioteca - <em>Dir.: GerenciamentoBiblioteca</em></h2></summary>

## 🛠 Proposta da atividade

Este projeto demonstra o uso prático de **POO** com Java. 
Aplicando os conceitos do paradigma, montamos uma estrutura de projeto simples capaz de realizar de uma forma reduzida o gerenciamento de uma biblioteca.
Dentre as funcionalidades temos como **cadastrar livros, membros e empréstimos**, **editar os mesmos**, **listar os cadastrados** e **remover os cadastros**.

---

### 📋 Estrutura dos Dados

Temos um [DIAGRAMA UML](https://lucid.app/lucidchart/bd1dfb0d-05f8-435d-ac60-6ac66d68abb8/edit?invitationId=inv_76e2c4ff-fcda-4abf-b57f-4b3354baec52) representando as classes do projeto que foi elaborado utilizando a ferramenta [Lucid](https://lucid.app/) 

### 🧩 Funções de gerenciamento implementadas

#### ● Fluxo1️⃣ Gerenciar livros 
▶Listar, cadastrar, editar, remover.

#### ● Fluxo2️⃣ Gerenciar membros
▶Listar, cadastrar, editar, remover.

#### ● Fluxo3️⃣ Gerenciar empréstimos
▶Listar, cadastrar, editar, remover.

### 📋 Integrantes do grupo

#### ● [Gerson f. Ribeiro](https://github.com/gersonfribeiro)

#### ● [Yan Zampier](https://github.com/yanpzr)

#### ● [Allan Mota Melgaço](https://github.com/ALMelga)

</details>

<details>
  <summary><h2>📌 Atv. 3: Tamagotchi - <em>Dir.: Tamagotchi</em></h2></summary>

## 🛠 Proposta da atividade

Este projeto demonstra o uso prático de **POO** com Java.  
Conforme vamos avançando com as práticas, novos conceitos vão sendo implementados nas propostas das atividades, dessa vez adicionamos um **Scaner** para receber **entrada de dados** do usuário e os blocos **try/catch** para implementação de **exceptions**.

---

### 📋 Estrutura dos Dados

A classe `Animal` define a estrutura de cada Tamagotchi sendo a nossa classe abstrata:

```java
public abstract class Animal {
    private String nome;
    private ClassesAnimal classe;
    private FamiliasAnimal familia;
    private Integer idade;
    private Boolean estado;
    private Integer calorias;
    private Integer forca;

    // Construtor, Getters e Setters...

    abstract Animal nascer();
    
    abstract void morrer(Animal animal);
    
    abstract void comer(Animal animal);
    
    abstract void correr(Animal animal);
    
    abstract void dormir(Animal animal);
}
```

## 🔭 Classes implementando a abstração

Uma classe SeuTamagotchi extende e implementa os métodos abstratos contidos na classe animal, assim como também contém em sua implementação o Scanner que é responsável por receber a entrada de dados do usuário para executar com sucesso o método nascer()

### 🧩 Funções Implementadas

#### ● Function1️⃣ nascer() 
▶Utiliza métodos auziliares para imprimir as opções válidas no console, utilizar um Scanner para receber a entrada dos dados, validar e se caso der erro levantar uma exception e solicitar novos dados ao usuário. Após tudo estar correto ele instancia um novo Objeto.

#### ● Function2️⃣ morrer(Animal animal)
▶Alterações no objeto passado como referência no parâmetro. Modifica o estado de vivo ou morto e zera a força.

#### ● Function3️⃣ comer(Animal animal)
▶Alterações no objeto passado como referência no parâmetro. Valida se o animal está vivo e se não está cheio para que então modifique o estado de calorias e força.

#### ● Function4️⃣ correr(Animal animal)
▶Alterações no objeto passado como referência no parâmetro. Valida se o animal está vivo e se não está exausto para que então modifique o estado de calorias e força.

#### ● Function5️⃣ dormir(Animal animal)
▶Alterações no objeto passado como referência no parâmetro. Valida se o animal está vivo para que então modifique o estado de calorias e força.

</details>
