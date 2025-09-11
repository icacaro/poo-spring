# Resumo das Rotas da API

## 1. ProdutoController
**Base URL**: `/api/produtos`

| Método HTTP  | Endpoint                   | Descrição                                           | Parâmetros/Corpo de Requisição                             | Exemplo de Uso                                      |
|--------------|----------------------------|-----------------------------------------------------|------------------------------------------------------------|-----------------------------------------------------|
| `GET`        | `/api/produtos`             | Lista todos os produtos                            | Nenhum (retorna todos os produtos)                          | `GET /api/produtos`                                 |
| `GET`        | `/api/produtos/{id}`        | Busca um produto pelo ID                           | `id` (caminho) - ID do produto                              | `GET /api/produtos/1`                              |
| `POST`       | `/api/produtos`             | Cria um novo produto                               | Corpo: `Produto` - Objeto com as informações do produto     | `POST /api/produtos` com corpo: `{ "nome": "Produto A", "preco": 20.5 }` |
| `DELETE`     | `/api/produtos/{id}`        | Deleta um produto pelo ID                          | `id` (caminho) - ID do produto a ser deletado               | `DELETE /api/produtos/1`                            |

### Como Usar:
- **Listar produtos**: `GET /api/produtos`
- **Buscar produto por ID**: `GET /api/produtos/{id}`
- **Criar produto**: `POST /api/produtos` (com corpo: `{ "nome": "Produto", "preco": 10.5 }`)
- **Deletar produto**: `DELETE /api/produtos/{id}`

---

## 2. MensagemController
**Base URL**: `/api`

| Método HTTP  | Endpoint          | Descrição                           | Parâmetros/Corpo de Requisição | Exemplo de Uso                |
|--------------|-------------------|-------------------------------------|--------------------------------|-------------------------------|
| `GET`        | `/api/mensagem`    | Retorna uma mensagem padrão         | Nenhum                         | `GET /api/mensagem`           |

### Como Usar:
- **Obter mensagem**: `GET /api/mensagem`

---

## 3. AuthController
**Base URL**: `/auth`

| Método HTTP  | Endpoint               | Descrição                                           | Parâmetros/Corpo de Requisição                                 | Exemplo de Uso                                      |
|--------------|------------------------|-----------------------------------------------------|----------------------------------------------------------------|-----------------------------------------------------|
| `POST`       | `/auth/register`        | Registra um novo usuário                            | Corpo: `Map<String, String>` com campos: `username` e `password` | `POST /auth/register` com corpo: `{ "username": "usuario", "password": "senha" }` |
| `POST`       | `/auth/login`           | Realiza login e retorna um token JWT                | Corpo: `Map<String, String>` com campos: `username` e `password` | `POST /auth/login` com corpo: `{ "username": "usuario", "password": "senha" }` |

### Como Usar:
- **Registrar um usuário**: `POST /auth/register` com corpo:
  ```json
  {
    "username": "usuario",
    "password": "senha"
  }




### 

Fazer login: POST /auth/login com corpo:

{
  "username": "usuario",
  "password": "senha"
}


Se as credenciais estiverem corretas, a resposta será:

{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}

Autenticação: Após o login, use o token JWT nas rotas protegidas, incluindo-o no cabeçalho da requisição Authorization: Bearer {token}.
