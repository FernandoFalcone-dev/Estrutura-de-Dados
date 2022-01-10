# Estrutura de dados em Java  :coffee:

### Descrição  

Repositório feito durante um curso de revisão de Estrutura de Dados com a linguagem Java.  
O intuito é compartilhar conteúdo e ao mesmo tempo deixar resgistrado todo o assunto abordado durante o curso. A fim de deixar de fácil acesso à todos que queiram visualizar e contribuir.

### Tipo Abstrato de Dados (TAD)  

Conjunto de valores e uma sequência de operações sobre estes valores, ou seja, um TAD encapsula ou agrupa um conjunto de dados associado a um elemento de computação junto aos operadores, que atuam na modificação desses dados.

### Conceito  

> *"Uma estrutura de dados (ED), em ciência da computação, é uma coleção tanto de valores (e seus  relacionamentos) quanto de operações (sobre os valores e estruturas decorrentes). É uma implementação concreta de um tipo abstrato de dado (TAD) ou um tipo de dado (TD) básico ou primitivo."*

### Atribuição e Referência em Java  

As atribuições em Java são sempre por cópia de valor.  

**Com Tipo Primitivo**: se é copiado o valor em memória.  
Ex.: Se `int a = 5;` e `int b = a;` então `a = 5 && b = 5`  

**Com Objetos**: se é copiado o valor da referência em memória, sem duplicar o objeto.  
Ex.: Se `NumObj num1 = new NumObj();` e `NumObj num2 = num1;` então ambos os objetos apontarão para o mesmo endereço de memória `NumObj@4617c264 - NumObj@4617c264`.  

**Obs.:** Se faz necessário usar do método `toString()` para printar os valores dos atributos do objeto que queremos, ao invés dos seus endereços de memória.  

### Conceito de Nó  

É um espaço em memória que armazena tanto o dado que queremos quanto uma referência para um próximo nó.  

![Conceito de nó](img/no.png)  

#### Linked List  

Podemos dizer que é uma coleção de nós que juntos representam uma sequência. Nessa estrutura, um nó sempre irá apontar para o próximo, baseado em sua referência, e quando não houver próximo nó, será apontado para null (uma referência nula).

![Lista encadeada](img/lista-encadeada.png)  