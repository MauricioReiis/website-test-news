# Plano de Testes - Sistema de Notícias (Backend)

**Projeto:** website-test-news  
**Versão:** 1.0-SNAPSHOT  
**Data:** 03/11/2025  
**Tipo:** Projeto Acadêmico

---

## 1. OBJETIVO

Documentar e validar os testes unitários implementados para as classes do backend do sistema de notícias, garantindo que:
- Todas as validações de entrada funcionam corretamente
- As regras de negócio são respeitadas
- Os comportamentos esperados são mantidos

---

## 2. ESCOPO

### 2.1 Classes Testadas

| Classe | Responsabilidade | Arquivo de Teste | Testes |
|--------|------------------|------------------|--------|
| `Admin.java` | Autenticação e gerenciamento de admin | `AdminTest.java` | 13 |
| `News.java` | Entidade de notícia | `NewsTest.java` | 8 |
| `Contact.java` | Formulário de contato | `ContactTest.java` | 15 |
| **TOTAL** | | | **36** |

### 2.2 O Que Foi Testado

✅ Validações de campos obrigatórios  
✅ Autenticação (login/logout)  
✅ Criação de objetos  
✅ Getters e setters  
✅ Validação de e-mail  
✅ Regras de negócio (ex: admin autenticado para criar notícia)  

### 2.3 O Que Não Foi Testado

❌ Persistência em banco de dados  
❌ Interface frontend  
❌ API REST  
❌ Integração entre módulos  
❌ Performance  

---

## 3. TIPOS DE TESTE

### 3.1 Testes Unitários

**Framework:** JUnit 4.13.2 + JUnit Jupiter 5.8.2  
**Total:** 36 testes  
**Status:** ✅ 100% aprovados (0 falhas)  
**Tempo de execução:** ~8 segundos

**Distribuição:**
- Testes de validação: 15
- Testes de comportamento: 13  
- Testes de getters/setters: 8

---

## 4. FERRAMENTAS

| Ferramenta | Versão | Uso |
|------------|--------|-----|
| Java JDK | 11 | Linguagem |
| Maven | 3.x | Build |
| JUnit 4 | 4.13.2 | Testes |
| JUnit Jupiter | 5.8.2 | Testes |
| Surefire | 2.12.4 | Execução |

**Comando para executar:**
```bash
mvn clean test
```

---

## 5. CENÁRIOS DE TESTE

### 5.1 AdminTest.java (13 testes)

| ID | Cenário | Resultado Esperado | Status |
|----|---------|-------------------|--------|
| T01 | Criar admin sem nome | Lança `IllegalArgumentException` | ✅ |
| T02 | Criar admin sem senha | Lança `IllegalArgumentException` | ✅ |
| T03 | Obter nome do admin | Retorna nome correto | ✅ |
| T04 | Alterar nome do admin | Nome é atualizado | ✅ |
| T05 | Obter senha do admin | Retorna senha correta | ✅ |
| T06 | Alterar senha do admin | Senha é atualizada | ✅ |
| T07 | Verificar status de autenticação | Retorna `false` inicialmente | ✅ |
| T08 | Alterar status de autenticação | Status é atualizado | ✅ |
| T09 | Login com credenciais válidas | Retorna `true` e autentica | ✅ |
| T10 | Login com credenciais inválidas | Retorna `false` | ✅ |
| T11 | Logout | Status de autenticação vira `false` | ✅ |
| T12 | Criar notícia autenticado | Retorna `true` | ✅ |
| T13 | Criar notícia não autenticado | Retorna `false` | ✅ |

**Observações:**
- Senha armazenada em texto plano (não é seguro, mas está fora do escopo atual)
- Testes cobrem casos positivos e negativos

### 5.2 NewsTest.java (8 testes)

| ID | Cenário | Resultado Esperado | Status |
|----|---------|-------------------|--------|
| T14 | Criar notícia sem título | Lança `IllegalArgumentException` | ✅ |
| T15 | Criar notícia sem descrição | Lança `IllegalArgumentException` | ✅ |
| T16 | Obter título da notícia | Retorna título correto | ✅ |
| T17 | Alterar título da notícia | Título é atualizado | ✅ |
| T18 | Obter descrição da notícia | Retorna descrição correta | ✅ |
| T19 | Alterar descrição da notícia | Descrição é atualizada | ✅ |
| T20 | Obter data da notícia | Retorna data atual (truncada) | ✅ |
| T21 | Alterar data da notícia | Data é atualizada | ✅ |

**Observações:**
- Data é gerada automaticamente no construtor
- Teste de data usa truncamento para evitar diferenças de milissegundos

### 5.3 ContactTest.java (15 testes)

| ID | Cenário | Resultado Esperado | Status |
|----|---------|-------------------|--------|
| T22 | Criar contato sem nome | Lança `IllegalArgumentException` | ✅ |
| T23 | Criar contato sem email | Lança `IllegalArgumentException` | ✅ |
| T24 | Criar contato sem assunto | Lança `IllegalArgumentException` | ✅ |
| T25 | Criar contato sem mensagem | Lança `IllegalArgumentException` | ✅ |
| T26 | Obter nome do contato | Retorna nome correto | ✅ |
| T27 | Alterar nome do contato | Nome é atualizado | ✅ |
| T28 | Obter email do contato | Retorna email correto | ✅ |
| T29 | Alterar email do contato | Email é atualizado | ✅ |
| T30 | Get/Set telefone | Telefone é definido e recuperado | ✅ |
| T31 | Obter assunto | Retorna assunto correto | ✅ |
| T32 | Alterar assunto | Assunto é atualizado | ✅ |
| T33 | Obter mensagem | Retorna mensagem correta | ✅ |
| T34 | Alterar mensagem | Mensagem é atualizada | ✅ |
| T35 | Enviar mensagem com email válido | Retorna `true` | ✅ |
| T36 | Enviar mensagem com email inválido | Retorna `false` | ✅ |

**Observações:**
- Validação de email usa regex simples
- Telefone é opcional (não validado no construtor)

---

## 6. MÉTRICAS

### 6.1 Resultados Gerais

| Métrica | Valor |
|---------|-------|
| Total de testes | 36 |
| Testes aprovados | 36 (100%) |
| Testes falhados | 0 |
| Tempo de execução | ~8 segundos |
| Cobertura de código | Não medida* |

*Recomenda-se adicionar JaCoCo para medir cobertura

### 6.2 Distribuição por Classe

```
AdminTest    ████████████▌ 13 testes (36.1%)
ContactTest  ██████████████████▌ 15 testes (41.7%)
NewsTest     ████████▌ 8 testes (22.2%)
```

### 6.3 Tipos de Asserção Utilizadas

- `assertEquals()` - Comparação de valores
- `assertTrue()` / `assertFalse()` - Verificação booleana
- `assertThrows()` - Validação de exceções

---

## 7. PROBLEMAS CONHECIDOS

### 7.1 Limitações Atuais

| Problema | Impacto | Observação |
|----------|---------|------------|
| Senha em texto plano | 🔴 Alto | Inseguro, mas fora do escopo acadêmico |
| Mistura JUnit 4 e 5 | 🟡 Médio | Inconsistência, mas funcional |
| Cobertura não medida | 🟡 Médio | Impossível garantir % de código testado |
| Validações limitadas | 🟢 Baixo | Email com regex simples |

---

## 8. COMO EXECUTAR

### 8.1 Executar Todos os Testes

```bash
cd website-test-news
mvn clean test
```

### 8.2 Executar Teste Específico

```bash
# Apenas AdminTest
mvn test -Dtest=AdminTest

# Apenas um método
mvn test -Dtest=AdminTest#testLogin
```

### 8.3 Verificar Resultados

**Console:**
```
Tests run: 36, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

**Relatório HTML:**
```
target/surefire-reports/index.html
```

---

## 9. ESTRUTURA DO CÓDIGO DE TESTE

### 9.1 Padrão Utilizado

Todos os testes seguem o padrão **AAA** (Arrange-Act-Assert):

```java
@Test
@DisplayName("Descrição clara do teste")
public void testNomeDescritivo() {
    // Arrange (preparação)
    Admin admin = new Admin("admin", "senha");
    
    // Act (ação)
    boolean result = admin.login("admin", "senha");
    
    // Assert (verificação)
    assertTrue(result);
}
```

### 9.2 Convenções

- Nome dos métodos: `test + Comportamento`
- Uso de `@DisplayName` para documentação
- Um assert por cenário (quando possível)
- Mensagens de erro claras

---

## 10. CONCLUSÃO

### 10.1 Resumo

✅ **36 testes unitários** implementados e funcionando  
✅ **100% de aprovação** em todos os testes  
✅ **Cobertura funcional** das 3 classes principais  
✅ **Validações** de entrada implementadas e testadas  

### 10.2 Status do Projeto

O backend possui testes adequados para um projeto acadêmico. As funcionalidades principais estão cobertas por testes unitários que validam:

- Comportamento correto com dados válidos
- Tratamento de erros com dados inválidos  
- Regras de negócio implementadas

### 10.3 Próximos Passos

1. ✅ Concluir testes do backend (FEITO)
2. ⏳ Analisar e testar o frontend
3. ⏳ Documentar integração backend-frontend
4. ⏳ Criar plano de testes integrado (backend + frontend)

---

**Documento elaborado para fins acadêmicos**  
**Última atualização:** 03/11/2025
