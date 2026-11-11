# Desafio #06 — Validador de Senha Forte 🎀

> **Comunidade:** Tech Sisters · **Linguagem:** Java · **Dificuldade:** Intermediário  
> **Data de publicação do desafio:** 07/11/2026 (sábado)  
> **Prazo informado no Discord:** 07/11/2026, das 08h às 22h (horário de São Paulo)

## 💻 Proposta do desafio

Criar um algoritmo que receba uma senha como texto, verifique **cinco critérios de segurança simultaneamente** e informe **todos os motivos** caso a senha seja considerada inválida.

### ✅ Critérios

1. Ter **no mínimo 8 caracteres**.
2. Conter **pelo menos uma letra maiúscula** (A–Z).
3. Conter **pelo menos uma letra minúscula** (a–z).
4. Conter **pelo menos um número** (0–9).
5. Conter **pelo menos um caractere especial** (ex.: `@`, `#`, `$`, `%`, `&`, `!`, `*`).

### 🧪 Casos de teste do enunciado

| Entrada | Resultado esperado |
| :-- | :-- |
| `Senha123` | Inválida: não contém caractere especial |
| `techsisters` | Inválida: faltam maiúscula, número e caractere especial |
| `Code#2026` | Válida: atende a todos os requisitos |

> **Fonte:** comunicado do *Sisters Bot* no canal de desafios da comunidade Tech Sisters, publicado em **07/11/2026 às 08h01**. Os requisitos acima foram adaptados para documentação, preservando os critérios originais.

## ☕ Solução em Java

**[Abrir `ValidadorSenha.java`](ValidadorSenha.java)**

O programa lê uma senha com `Scanner`, percorre seus caracteres usando `for` e `charAt()` e registra os critérios encontrados em variáveis `boolean`. Em seguida, verifica se todos os requisitos foram cumpridos e, caso contrário, apresenta cada problema por meio de condições `if` independentes.

### 📚 Conceitos estudados

- Tipo `boolean` e operadores lógicos `&&` e `!`.
- Manipulação de `String` com `length()` e `charAt()`.
- Comparações entre caracteres e uso da classe `Character`.
- Estruturas de repetição `for` e condições `if/else`.
- Validação de dados com mensagens de erro específicas.

### ▶️ Executar

```bash
javac ValidadorSenha.java
java ValidadorSenha
```

> **Nota:** solução registrada para estudo e revisão de lógica Java. A verificação de símbolos aceita caracteres que não sejam letras, dígitos ou espaços em branco; em uma aplicação real, a política de senhas e os critérios de segurança podem ser diferentes.

---

[← Voltar à página principal](../../README.md)

<sub>Créditos do enunciado: comunidade Tech Sisters. Este repositório não é oficial da comunidade.</sub>
