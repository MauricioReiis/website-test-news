# Website Test News - Backend

[![Tests](https://img.shields.io/badge/tests-36%20passed-success)](.)
[![Java](https://img.shields.io/badge/Java-11-orange)](https://openjdk.java.net/)
[![Maven](https://img.shields.io/badge/Maven-3.x-blue)](https://maven.apache.org/)

Sistema de gerenciamento de notícias com autenticação - Projeto Acadêmico

## 📋 Sobre o Projeto

Backend em Java que implementa:
- ✅ Autenticação de administradores (login/logout)
- ✅ Criação e gerenciamento de notícias
- ✅ Sistema de contato com validação de e-mail

## 🚀 Tecnologias

- **Java 11** - Linguagem de programação
- **Maven 3.x** - Gerenciamento de dependências
- **JUnit 4.13.2 e 5.8.2** - Framework de testes

## 📦 Pré-requisitos

```bash
java -version  # Java 11 ou superior
mvn -version   # Maven 3.x
```

## 🔧 Instalação e Execução

```bash
# Clonar o repositório
git clone https://github.com/MauricioReiis/website-test-news.git
cd website-test-news

# Compilar
mvn clean compile

# Executar testes
mvn test
```

**Resultado esperado:**
```
Tests run: 36, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

## 📁 Estrutura

```
src/
├── main/java/
│   ├── Admin.java          # Gerenciamento de administradores
│   ├── News.java           # Entidade de notícias
│   └── Contact.java        # Sistema de contato
└── test/java/
    ├── AdminTest.java      # 13 testes
    ├── NewsTest.java       # 8 testes
    └── ContactTest.java    # 15 testes
```

## 🧪 Testes

### Executar Todos os Testes

```bash
mvn clean test
```

### Executar Teste Específico

```bash
# Classe específica
mvn test -Dtest=AdminTest

# Método específico
mvn test -Dtest=AdminTest#testLogin
```

### Métricas de Teste

| Métrica | Valor |
|---------|-------|
| **Total de Testes** | 36 |
| **Taxa de Sucesso** | 100% |
| **Tempo de Execução** | ~8 segundos |

**Distribuição:**
- AdminTest: 13 testes (36.1%)
- ContactTest: 15 testes (41.7%)
- NewsTest: 8 testes (22.2%)

## 📚 Documentação

📄 **[PLANO_DE_TESTES.md](PLANO_DE_TESTES.md)** - Documentação completa dos testes:
- Objetivos e escopo
- Cenários de teste detalhados (36 casos)
- Métricas e resultados
- Como executar os testes

## 🎯 Funcionalidades Testadas

### Admin (13 testes)
- ✅ Validação de campos obrigatórios
- ✅ Login/logout
- ✅ Criação de notícias (com autenticação)
- ✅ Getters e setters

### News (8 testes)
- ✅ Validação de título e descrição
- ✅ Geração automática de data
- ✅ Getters e setters

### Contact (15 testes)
- ✅ Validação de todos os campos
- ✅ Validação de formato de e-mail
- ✅ Envio de mensagem
- ✅ Getters e setters

## ⚠️ Limitações Conhecidas

| Item | Status | Nota |
|------|--------|------|
| Senha em texto plano | ⚠️ | Inseguro, mas fora do escopo acadêmico |
| Sem persistência | ℹ️ | Dados não são salvos |
| Cobertura não medida | ℹ️ | JaCoCo não configurado |

## 👥 Autor

**Mauricio Reis** - [MauricioReiis](https://github.com/MauricioReiis)

## 📝 Licença

Projeto acadêmico - MIT License

---

**Status:** 🟢 Ativo  
**Última atualização:** 03/11/2025
