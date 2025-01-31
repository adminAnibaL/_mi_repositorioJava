Examen Orientación a Objetos
Se desea desarrollar una pequeña aplicación que, en un futuro, podría convertirse en una red
social. En esta aplicación, cada usuario puede publicar mensajes, teniendo en cuenta las
siguientes restricciones:
1. Un usuario solo puede almacenar hasta 10 mensajes como máximo.
2. Cada mensaje tiene un límite de 150 caracteres.
3. Los mensajes pueden ser de dos tipos: públicos o privados.
   ○ Los públicos pueden ser vistos por cualquier otro usuario.
   ○ Los privados solo pueden ser vistos por los amigos del autor del mensaje.
4. Un usuario puede indicar que le “gusta” un mensaje publicado por otra persona; esto
   incrementa en 1 el contador de “likes” del mensaje.
   En cuanto a la relación de amistad, para que dos usuarios se consideren amigos:
   ● Cada uno debe haber agregado al otro a su lista de amigos.
   ● Si solo una de las partes agrega a la otra, no se establece la amistad completa.
   Por tanto, cada usuario puede visualizar los mensajes de los demás, siempre que se cumpla
   alguna de estas condiciones:
   ● El mensaje es público.
   ● Existe amistad completa entre el usuario que publica y el usuario que ve.
   El objetivo es programar la lógica necesaria para que los usuarios puedan:
   ● Agregar amigos, de modo que en un futuro se compruebe si la amistad está
   conrmada. Debes suponer que un usuario puede agregar un número innito de
   amigos. De otra forma, se restará 0.5 puntos.
   ● Publicar mensajes (públicos o privados, respetando el límite de 150 caracteres y el
   máximo de 10 mensajes por usuario).
   ● Dar “like” a un mensaje de otro usuario, incrementando su contador de “likes”.
   ● Ver los mensajes de otros usuarios, mostrando solo aquellos a los que se tiene
   acceso (públicos o privados de amigos).
   Tu trabajo será codicar esta aplicación de modo que se cumplan todas las reglas descritas
   y, posteriormente, comprobar que el funcionamiento es correcto con distintos usuarios,
   relaciones de amistad y tipos de mensajes (ver un poco más abajo).
   Ten en cuenta lo siguiente:
   ● No debes controlar que un usuario de like más de una vez al mismo mensaje.
   ● No se pueden borrar los mensajes.
   ● Un usuario puede darse un like a sí mismo.
   IES Padre José Miravent.
   Módulo: Programación 24/25
   Para aclarar un poco, se acompaña de la clase Principal, cuya salida esperada es la
   siguiente:
   El mensaje supera la longitud máxima
   Juan ve los mensajes de Pedro:
   Hola amigos (1 likes)
   Estoy jugando al LOL, ¿alguien para una partidita? (0 likes)
   Juan ve los mensajes de Maria:
   ¡Buenos días! (2 likes)
   ¡¡Mañana me voy de vacaciones!! (0 likes)
   Pedro ve los mensajes de Juan:
   Hola a todos (1 likes)
   Pasando el finde en casa (0 likes)
   Estudiando mucho (0 likes)
   Pedro ve los mensajes de Maria:
   ¡Buenos días! (2 likes)
   Maria ve los mensajes de Juan:
   Hola a todos (1 likes)
   Pasando el finde en casa (0 likes)
   Estudiando mucho (0 likes)
   Maria ve los mensajes de Pedro:
   Estoy jugando al LOL, ¿alguien para una partidita? (0 likes)