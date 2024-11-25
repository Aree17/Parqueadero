# Sistema de gestión de parqueaderos
![parqueadero](https://github.com/user-attachments/assets/a333af47-cb73-4305-bded-a6215b9dadd7)

## Introducción
Este módulo tiene como finalidad gestionar un parqueadero que está compuesto por múltiples pisos. Cada piso tiene varias plazas de parqueo. Los vehículos pueden ser de diferentes tipos: automóviles, motocicletas y bicicletas. Todos comparten características comunes como matrícula, modelo y color, pero tienen atributos específicos según el tipo.
Los usuarios del parqueadero pueden ser clientes regulares o visitantes. Los clientes regulares tienen una suscripción activa y un método de pago asociado. Los visitantes pagan por las horas usadas.
El sistema debe maneja reservas en plazas específicas para clientes regulares. Los empleados del parqueadero se dividen en supervisores y cajeros, encargados de supervisar las operaciones, generar facturas y cobrar lo requerido.

## Cambios realizados
En comparación al primer diagrama UML realizado, el diagrama actual tiene algunas modificaciones que se explican a continuación. Para mayor comocidad se  ha dividido los cambios de acuerdo a su rol en el diagrama de clases:

### **1. Relaciones** 
- Se cambio la multiplicidad y dirección de la relación en clases como Plaza, Factura y RentaPlaza.
- Se agregaron relaciones en algunas clases como Factura, Cajero y Supervisor.
- Se eliminaron relaciones, especialmente la realación de dependencia entre Suscripción y Vehículo.
- 
### **2. Atributos**
- La clase Reserva tiene un nuevo atributo denominado codigo.
- En las clases Piso, Plaza y RentaPorHoras se eliminaron de uno a dos elementos.

### **3. Métodos**
- La clase visitante adquiere un nuevo método.
- Las clases Supervisor y Cajero sufren modificaciones en sus métodos.
