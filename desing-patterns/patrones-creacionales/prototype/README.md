# Prototype

El patrón prototype tiene un objetivo muy sencillo: crear a partir de un modelo.Permite crear objetos prediseñados sin conocer detalles de cómo crearlos. Esto lo logra especificando los prototipos de objetos a crear. Los nuevos objetos que se crearán de los prototipos, en realidad, son clonados. Vale decir, tiene como finalidad crear nuevos objetos duplicándolos, clonando una instancia creada previamente.

Cuando utilizar este patrón.

- Aplica en un escenario donde sea necesario la creación de objetos parametrizados como "recién salidos de fábrica" ya listos para utilizarse, con la gran ventaja de la mejora de la performance: clonar objetos es más rápido que crearlos y luego setear cada valor en particular.
- Este patrón debe ser utilizado cuando un sistema posea objetos con datos repetitivos, en cuanto a sus atributos: por ejemplo, si una biblioteca posee una gran cantidad de libros de una misma editorial, mismo idioma, etc. Hay que pensar en este patrón como si fuese un fábrica que tiene ciertas plantillas de ejemplos de sus prodcutos y, a partir de estos prototipos, puede crear una gran cantidad de productos con esas características.

## Diagrama UML

![prototype](/images/prototype.jpg)

**Prototype**: declara la interface del objeto que se clona. Suele ser una clase abstracta.

**PrototypeConcreto**: las clases en este papel implementan una operación por medio de la clonación de sí mismo.

**Cliente**: crea nuevos objetos pidiendo al prototipo que se clone.

Los objetos de Prototipo Concreto heredan de Prototype y de esta forma el patrón se asegura de que los objetos prototipo proporcionan un conjunto consistente de métodos para que los objetos clientes los utilicen.

## Ejemplo

Nuestro ejemplo será muy sencillo: prototipos de TVs. Para ello crearemos la clase TV y dos subclases: LCD y Plasma.

## Consecuencias

- Un programa puede dinámicamente añadir y borrar objetos prototipo en tiempo de ejecución. Esta es una ventaja que no ofrece ninguno de los otros patrones de creación.
- Esconde los nombres de los productos específicos al cliente.
- Se pueden especificar nuevos objetos prototipo variando los existentes.
- La clase Cliente es independiente de las clases exactas de los objetos prototipo que utiliza. y, además, no necesita conocer los detalles de cómo construir los objetos prototipo.
- Clonar un objeto es más rápido que crearlo.
- Se desacopla la creación de las clases y se evita repetir la instanciación de objetos con parámetros repetitivos.

## Otros temas a tener en cuenta.

Debido a que el patrón Prototye hace uso del método `clone()`, es necesaria una mínima explicación de su funcionamiento: todas las clases en Java heredan un método de la clase `Object` llamado clone. Un método clone de un objeto retorna una copia de ese objeto. Esto solamente se hace para instancias de clases que dan permiso para ser clonadas. Una clase da permiso para que su instancia sea clonada si, y solo si, ella implementa el interface `Cloneable`.

Por otro lado, es importante destacar que si va a variar el número de prototipos se puede utilizar un "administrador de prototipos". Otra opción muy utilizada es un `Map` como se ve en el ejemplo.