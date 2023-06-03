# Chain of Responsability

Permite establecer una cadena de objetos receptores a través de los cuales se pasa una petición formulada por un objeto emisor. La idea es que cualquiera de los receptores pueden responder a la petición en función de un criterio establecido. Encadena los objetos receptores y pasa la petición a través de la cadena hasta que es procesada por algún objeto.

Busca evitar un montón de `if – else` largos y complejos en nuestro código, pero sobre todas las cosas busca evitar que el cliente necesite conocer toda nuestra estructura jeráquica y que rol cumple cada integrante de nuestra estructura.

En múltiples ocasiones, un cliente necesita que se realice una función, pero o no conoce al servidor concreto de esa función o es conveniente que no lo conozca para evitar un gran acoplamiento entre ambos.

Se utiliza cuando:

- Las peticiones emitidas por un objeto deben ser atendidas por distintos objetos receptores.
No se sabe a priori cual es el objeto que me puede resolver el problema.
- Cuando un pedido debe ser manejado por varios objetos.
- El conjunto de objetos que pueden tratar una petición debería ser especificado dinámicamente.

La motivación detrás de este patrón es crear un sistema que pueda servir a diversas solicitudes de manera jerárquica. En otras palabras, si un objeto que es parte de un sistema no sabe cómo responder a una solicitud, la pasa a lo largo del árbol de objetos. Como el nombre lo implica, cada objeto de dicho árbol puede tomar la responsabilidad y atender la solicitud.

Un ejemplo típico podría ser el lanzar un trabajo de impresión. El cliente no sabe siquiera qué impresoras están instaladas en el sistema, símplemente lanza el trabajo a la cadena de objetos que representan a las impresoras. Cada uno de ellos lo deja pasar, hasta que alguno, finalmente lo ejecuta.
Hay un desacoplamiento evidente entre el objeto que lanza el trabajo (el cliente) y el que lo realiza (impresora).

## Diagrama UML

![chain-of-responsability](/images/chain-of-responsability.jpg)

**Handler**: define una interfaz para tratar las peticiones. Implementa el enlace al sucesor.

**HandlerConcreto**: trata las peticiones de las que es responsable. Si puede manejar la petición, lo hace, en caso contrario la reenvía a su sucesor.

**Cliente**: inicializa la petición. Conoce a un gestor que es el que lanza la petición a la cadena hasta que
alguien la recoge.

## Ejemplo

Escenario: estamos realizando el software para un banco y uno de los puntos más importantes es saber quién puede aprobar un crédito. Por lo tanto el banco define las siguientes reglas de negocio:

- Si el monto no supera los $ 10.000 entonces el ejecutivo de cuenta pueda aprobar el préstamo.
- Si el monto esta entre los $10.000 y $50.000 entonces la persona indicada para realizar la aprobación es el líder inmediato de dicho ejecutivo.
- Si el monto se encuentra entre $ 50.000 y $100.000 entonces es el Gerente quién debe realizar dicha aprobación.
- Por montos superiores a los $100.000 entonces la aprobación la realizará el Director.

Para este caso se ha decidido realizar un patrón Chain of Responsibility. Se decide crear una interface llamada IAprobador que debe implementar toda clase que pertenezca a nuestra cadena de responsabilidades.

## Consecuencias

- Reduce el acoplamiento.
- Añade flexibilidad para asignar responsabilidades a objetos.
- No se garantiza la recepción.