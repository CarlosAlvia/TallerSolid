# TallerSolid
## **GRUPO # 3**

### Integrantes:
* ALvia Carlos
* Quezada Luis
* Orrala Alex
* López Xavier


***1. Clases Helado y Pastel. Tienen mucha similitud, se debería crear una clase padre llamada Postre.***

Si, porque se incumple con principio Open-Closed ya que son clases realmente parecidas.
    
***2. Clases Procesos.OperacionesAderezo y Postre. ¿Es necesaria la clase OperacionesAderezo?. Se puede incluir dentro de postre un método para agregar un aderezo y para quitar un aderezo.***

Inclumple con el principio Open-Closed y Single Responsability, porque no esta cerrado a cambio ya que cada que cada vez que se ceraba un nuevo postre se creaba un nuevo metodo.

***3. Métodos calcularPrecioFinal() y  showPrecioFinal() están muy relacionados, deben estar en otra clase por si cambia la fórmula de cálculo. La clase nueva debe llamarse Procesos.ManejadorDePrecio.***

Correcto, incumple con el principio Single Responsability pues no es algo que deban hacer las clases.

***4. Enum Adicionales.Aderezo es muy estático, debe convertirse en clase abstract con un atributo nombre y un método abstracto setNombre para que cada tipo de aderezo sea una subclase de Aderezo e implemente dicho método. También, sobrescriba el método toString() en la clase Aderezo, para que devuelva el nombre del aderezo en mayúsculas.***

En efecto incumple con el principio Dependency Inversion, pues estaba dependiendo de un objeto concreto (Enum) cuando deberia ser de una clase abstracta.

***5. Paquete Leche y la clase Procesos.ManejadorDeLeche. En el main descomente las instrucciones para realizar el cambio del tipo de leche utilizada en cada postre, luego analice como solucionar el error generado en la clase Leche.LecheDeslactosada.***

Aqui se incumple el principio Liskov Substitution, aunque también de alguna manera el principio Dependency Inversion pues está dependiendo en mayor medida de las clases hijas que del padre que debería ser una clase abstracta.
