# Airline

Crea una aplicación que sirva para gestionar los vuelos de una aerolínea.

## POJOs

### Airline

Campos:
- Nombre
- Array de vuelos.

### Flight

Campos:
- flightNumber: int
- origin
- destination
- gateNumber (puerta de embarque): int
- pasajeros 

### Passenger 

Campos:
- NIF
- name
- surname
- seatNumber: Integer (con mayúsculas para que pueda ser null)

## Componentes

### Readers

Crea readers para todos los beans

### AirlineApp

Tendrá un método run() que realice los siguiente:
- Pide los datos de la aerolínea
- Inicia un bucle de menú con las siguientes opciones
    1. Muestra todos los vuelos
    2. Mostrar vuelos origen:
       - Pide un origen al usuario y muestra todos los vuelos que tengan ese origen
    3. Muestra los vuelos de un pasajero:
        - Se pide un nif
        - Se recorren los vuelos comprobando si alguno de sus pasajeros tiene el NIF. 
    4. Muestra asiento de pasajero
        - Se pide un flightNumber
        - Se pide un NIF
        - Se busca el vuelo y el pasajero:
          - Si no existe el vuelo se muestra "El vuelo no existe"
          - Si no se encuentra el pasajero en el vuelo se muestra "El pasajero no está registrado en el vuelo"
          - Si se encuentra el pasajero se muestra "El asiento asignado es <seatNumber>"
    5. Cambiar asiento de pasajero
        - Se pide un flightNumber
        - Se pide un NIF
        - Se pide un seatNumber (Integer)
        - Se busca el vuelo y el pasajero:
            - Si no existe el vuelo se muestra "El vuelo no existe"
            - Si no se encuentra el pasajero en el vuelo se muestra "El pasajero no está registrado en el vuelo"
            - Si se encuentra el pasajero se le cambia el asiento y se muestra el mensaje "Asiento asignado"
