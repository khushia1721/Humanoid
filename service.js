var myApp=angular.module("myModule",['ngRoute']);
myApp.config(["$routeProvider",function($routeProvider){
    $routeProvider.
    when("/login",{
        templateUrl:"view/login.html"  
    }).
    when("/signup",{
        templateUrl:"view/signup.html"
    }).
    when("/about",{
        templateUrl:"view/about.html"
    }).
    when("/servie",{
        templateUrl:"view/service.html" 
    }).
}
])