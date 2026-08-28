# API de Clima para Belo Horizonte

### Dependências Utilizadas

- Java 25
- Spring Boot
- Maven
- Open-Meteo API

---

### Endpoints

- `GET /climaBH/atual`
  - Retorna o clima atual em tempo real (temperatura, umidade, sensação térmica, vento e chuva)

- `GET /climaBH/diario`
  - Retorna a previsão do clima para o dia atual (máximas, mínimas, vento e precipitação)

- `GET /climaBH/semanal`
  - Retorna a previsão meteorológica completa para a semana (máximas, mínimas, vento e precipitação)

---

### Como Executar a Aplicação

##### Pré-requisitos
- JDK 25
- Maven
- Git

##### Passo a Passo:

1. Clonar o repositório e entrar na pasta do projeto:
   ```bash
   git clone https://github.com/joaom-abreu/DIAW
   cd ClimaAPI/ClimaAPI

2. Compilar e executar:
   ```bash
   mvn clean install
   mvn spring-boot:run
   
3. Testar os Endpoints:

   - http://localhost:8080/climaBH/atual
   - http://localhost:8080/climaBH/diario
   - http://localhost:8080/climaBH/semanal