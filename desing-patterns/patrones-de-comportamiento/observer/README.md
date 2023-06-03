# Observer

Este patrón de diseño permite reaccionar a ciertas clases llamadas observadores sobre un evento determinado.

Es usado en programación para monitorear el estado de un objeto en un programa. Está relacionado con el principio de invocación implícita. La motivación principal de este patrón es su utilización como un sistema de detección de eventos en tiempo de ejecución. Es una característica muy interesante en términos del desarrollo de aplicaciones en tiempo real.

Debe ser utilizado cuando:
 - Un objeto necesita notificar a otros objetos cuando cambia su estado. La idea es encapsular estos aspectos en objetos diferentes permite variarlos y reutilizarlos independientemente.
 - Cuando existe una relación de dependencia de uno a muchos que puede requerir que un objeto notifique a múltiples objetos que dependen de él cuando cambia su estado.

Este patrón tiene un uso muy concreto: varios objetos necesitan ser notificados de un evento y cada uno de ellos deciden como reaccionar cuando esta evento se produzca.

Un caso típico es la Bolsa de Comercio, donde se trabaja con las acciones de las empresas. Imaginemos que muchas empresas estan monitoreando las acciones una empresa X. Posiblemente si estas acciones bajan, algunas personas esten interesadas en vender acciones, otras en comprar, otras quizas no hagan nada y la empresa X quizas tome alguna decisión por su cuenta. Todos reaccionan distinto ante el mismo evento. Esta es la idea de este patrón y son estos casos donde debe ser utilizado.

## Diagrama UML

![observer](/images/observer.jpg)

**Subject**: conoce a sus observadores y ofrece la posibilidad de añadir y eliminar observadores. Posee un método llamado attach() y otro detach() que sirven para agregar o remover observadores en tiempo de ejecución.

**Observer**: define la interfaz que sirve para notificar a los observadores los cambios realizados en el Subject.

**SubjectConcreto**: almacena el estado que es objeto de interés de los observadores y envía un mensaje a sus observadores cuando su estado cambia.

**ObserverConcreto**: mantiene una referencia a un SubjectConcreto. Almacena el estado del Subject que le resulta de interés. Implementa la interfaz de actualización de Observer para mantener la consistencia entre los dos estados.

## Ejemplo

Vamos a suponer un ejemplo de una Biblioteca, donde cada vez que un lector devuelve un libro se ejecuta el método devuelveLibro(Libro libro) de la clase Biblioteca.

Si el lector devolvió el libro dañado entonces la aplicación avisa a ciertas clases que están interesadas en conocer este evento:

## Consecuencias

- Permite modificar las clases subjects y las observers independientemente.
- Permite añadir nuevos observadores en tiempo de ejecución, sin que esto afecte a ningún otro observador.
- Permite que dos capas de diferentes niveles de abstracción se puedan comunicar entre sí sin romper esa división.
- Permite comunicación broadcast, es decir, un objeto subject envía su notificación a todos los observers sin enviárselo a ningún observer en concreto (el mensaje no tiene un destinatario concreto). Todos los observers reciben el mensaje y deciden si hacerle caso ó ignorarlo.
- La comunicación entre los objetos subject y sus observadores es limitada: el evento siempre significa que se ha producido algún cambio en el estado del objeto y el mensaje no indica el destinatario.