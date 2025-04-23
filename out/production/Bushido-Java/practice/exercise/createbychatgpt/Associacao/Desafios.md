## 🔹 Exercício 1 – Associação Simples

### Objetivo:
Criar duas classes: `Pessoa` e `Endereco`.

### Requisitos:
- A classe `Pessoa` deve conter: `nome`, `idade` e um objeto do tipo `Endereco`.
- A classe `Endereco` deve conter: `rua`, `número` e `cidade`.
- A associação é unidirecional: a `Pessoa` conhece o `Endereco`, mas o `Endereco` não conhece a `Pessoa`.

### Desafio: ✅
Crie instâncias no método `main` e exiba as informações da `Pessoa` junto com seu `Endereco`.

---

## 🔹 Exercício 2 – Agregação

### Objetivo:
Modelar a relação entre `Curso` e `Aluno`.

### Requisitos:
- A classe `Curso` deve conter: `nome` e uma lista de `Aluno`.
- A classe `Aluno` deve conter: `nome` e `matricula`.
- Um `Curso` pode ter vários alunos, e um `Aluno` pode existir mesmo sem estar em um curso.

### Desafio:
Permita adicionar/remover alunos de um curso. Instancie um curso com 3 alunos e exiba os dados.

---

## 🔹 Exercício 3 – Composição

### Objetivo:
Modelar a relação entre `Departamento` e `Funcionario`.

### Requisitos:
- A classe `Departamento` deve conter: `nome` e uma lista de `Funcionario`.
- A classe `Funcionario` deve conter: `nome` e `salario`.
- A composição indica que se um `Departamento` for destruído, seus `Funcionarios` também são.

### Desafio:
Simule a exclusão de um `Departamento` e mostre que os `Funcionarios` também deixam de existir.

---

## 🔹 Exercício 4 – Associação Bidirecional

### Objetivo:
Relacionar `Professor` e `Disciplina`.

### Requisitos:
- Um `Professor` pode lecionar várias disciplinas.
- Cada `Disciplina` possui um professor responsável.
- A associação é bidirecional: adicionar uma `Disciplina` ao `Professor` também a vincula ao `Professor`.

### Desafio:
Adicione disciplinas a um professor e mostre a relação nos dois sentidos.

---

## 🔹 Exercício 5 – Sistema de Biblioteca (Composição + Agregação)

### Objetivo:
Construir um pequeno sistema com `Biblioteca`, `Livro` e `Autor`.

### Requisitos:
- A `Biblioteca` possui uma lista de `Livro`.
- O `Livro` possui `titulo` e um ou mais `Autor`.
- Os `Autores` são agregados (existem fora dos livros), mas os `Livros` são compostos pela `Biblioteca`.

### Desafio:
Implemente as classes e simule a adição de livros com autores à biblioteca. Mostre os dados em tela.

---
