# pizzaMaker

The pizza shop

# Required

* java 8
* Rest client

# Estructure

* For the different types of cheese, sauce, crust and size the pattern strategy was used because we need make the algorithms interchangeable within that family.
* For the different ingredients that can be added or not to a pizza was used the pattern decorator to facilitate this process
* Each type of pizza has its own builder who knows how to create a type of flavor
* To create each builder or  ingredient were created factories that know exactly what type to create.

# Instruction

* run the web application proyect
* consume the rest services to make an orde

# WS

* /PizzaService/orderPizza/{cheeseId}/{crustId}/{sauceId}/{slice}/{option}/{builder}/{topping}order </br>
  this method recives all the id of ingredients for the pizza. </br>
  cheeseId= type of cheese </br>
  crustId= type of crust </br>
  sauceId= type of sauce </br>
  slice= size of the pizza </br>
  option= number of slice  </br>
  builder= flavor of pizza, example veggie </br>
  topping= type of topping for the pizza, format: 1,2,3 </br>
  Example: http://localhost:8080/pizzaMaker/rest/PizzaService/orderPizza/1/3/4/5/1/1/3,3,2,2</br>
  Responce: </br>
  pizza> </br>
    bakingTime> 27.0 </br>
    description> pizza thin crust, blue cheese, sweet sauce, bacon, corn, corn, corn, bacon, bacon </br>
    pizzaSlice> 5 </br>
    sendPizza> true </br>  
  pizza>
* /PizzaService/orderPasta/{option}/{cheeseId}/{sauceId} </br>
 this method recives the pasta id and the ingredients for the pasta</br>
  cheeseId= type of cheese </br>
  sauceId= type of sauce </br>
 Example: http://localhost:8080/pizzaMaker/rest/PizzaService/orderPasta/2/1/1</br>
 Responce: </br>
 pasta></br>
    description>pasta blue cheese, basic sauce, spaghetti</br>
 pasta
* /PizzaService/orderSalad/{option} </br>
 this method recives the salad id</br>
  option= salad type </br>
 Example: http://localhost:8080/pizzaMaker/rest/PizzaService/orderSalad/1</br>
 Responce: </br>
 salad></br>
    description>salad: , tommato, onion</br>
 salad>

# Types
* Cheese </br>
BlueCheese: 1 </br>
DamboCheese: 2 </br>
MozzarellaCheese: 3 </br>
* Crust </br>
CheeseCrust: 1 </br>
ThickCrust: 2 </br>
ThinCrust: 3 </br>

* Sauce </br>
BasicSauce: 1 </br>
HotSauce: 2 </br>
ItalianSauce: 3 </br>
SweetSauce : 4 </br>

* Size </br>
PersonalSize: 1 </br>
SmallSize: 2 </br>
MediumSize: 3 </br>
LargeSize : 4 </br>

* Pizza </br>
BrazilianPizza: 1 </br>
HawaiianPizza: 2 </br>
VeggiePizza: 3 </br>
* Pasta </br>
Lasagna: 1 </br>
Spaghettibuilder: 2 </br>

* Salad </br>
BasicSalad: 1 </br>
* Tooping  </br>
Asparagus: 1 </br>
Bacon: 2 </br>
Corn: 3 </br>
Pineapple : 4 </br>

# Improvement
* For the res methods: send  parameters more explicit objects to make it more readable and effective
* Make the pasta and salad more flexible as the pizza builder
* create methods for display a food menu.

