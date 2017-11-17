/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var app = angular.module('demo', []);
app.controller('Hello', function($scope, $http) {
    $http.get('api/persons/').
        then(function(response) {
            $scope.names = response.data;
        });
    $scope.refresh = function () {
        $http.get('api/persons/').
        then(function(response) {
            $scope.names = response.data;
        });
    }
});
app.controller('formCtrl', function($scope,$http) {
   $scope.master = {name:"John"};
    $scope.reset = function() {
        $scope.user = angular.copy($scope.master);
    };
    $scope.reset();
    $scope.insert = function(){
     $http.put('api/persons',$scope.user);   
    };
});