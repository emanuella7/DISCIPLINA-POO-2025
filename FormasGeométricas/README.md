
# Figuras Geométricas com Programação Orientada a Objetos

Este repositório demonstra a aplicação dos princípios da Programação Orientada a Objetos (POO) no desenvolvimento de classes que calculam áreas e volumes de figuras geométricas planas e espaciais.

---

## Objetivos

- Implementar figuras geométricas usando POO.
- Aplicar os conceitos de Abstração, Encapsulamento e Herança.
- Separar a lógica em módulos para facilitar o entendimento e a manutenção do código.

---

## Conceitos Aplicados

| Conceito        | Descrição |
|-----------------|-----------|
| **Abstração**   | Isola a interface da implementação. |
| **Encapsulamento** | Controla o acesso aos dados das classes. |
| **Herança**     | Permite reutilização e extensão de comportamentos. |

---

## Estrutura dos Diretórios

O projeto está dividido em três módulos, um para cada conceito de POO:

### 1. `figurasGeometricas - Abstração`

- Classes com métodos essenciais, ocultando os detalhes internos.
- Pacotes:
  - `br.edu.principal`
  - `br.edu.figurasgeometricasplanas`

![UML - Abstração](https://github.com/user-attachments/assets/680759c0-c425-4bc8-935a-736292f7537c)

---

### 2. `figurasGeometricas - Encapsulamento`

- Atributos protegidos com métodos `get` e `set`.
- Pacotes:
  - `br.edu.principal`
  - `br.edu.figurasgeometricasplanas`
  - `br.edu.figurasgeometricasespacias`

![UML - Encapsulamento](https://github.com/user-attachments/assets/97535320-bfa7-4d7c-af14-a0544285c153)

---

### 3. `figurasGeometricas - Herança`

- Uso de superclasses (`FiguraPlana`, `FiguraEspacial`) e subclasses específicas.
- Pacotes:
  - `br.edu.principal`
  - `br.edu.figurasgeometricasplanas`
  - `br.edu.figurasgeometricasespacias`

![UML - Herança](https://github.com/user-attachments/assets/d94644c8-ee11-4d58-852b-f6f6184e3bed)

---

## Figuras Implementadas

### Planas
- Triângulo
- Retângulo
- Quadrado
- Círculo
- Trapézio
- Paralelogramo
- Losango
- Pentágono
- Hexágono

### Espaciais
- Cubo
- Prisma
- Esfera
- Pirâmide
- Cone
- Cilindro
- Paralelepípedo
- Tetraedro

---

## Estrutura das Classes

Cada classe segue a seguinte estrutura:

- Atributos privados
- Construtor com parâmetros
- Métodos:
  - `calcArea()`
  - `calcVolume()` *(para figuras espaciais)*

---

## Execução

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/figurasGeometricasPOO.git
