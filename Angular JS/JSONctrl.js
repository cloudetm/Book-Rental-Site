function JSONctrl($scope,$http) {
    $http.get("http://172.25.34.89:8080/R2R/ws/books")
    .success(function(response) {$scope.names = response;});
}