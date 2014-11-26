angular.module('search', ['ui.bootstrap']);
angular.module('search').controller('searchCtrl', function ($scope) {
   $scope.status = {
    isopen: false
  };

  $scope.toggled = function(open) {
    console.log('Dropdown is now: ', open);
  };

  $scope.toggleDropdown = function($event) {
    $event.preventDefault();
    $event.stopPropagation();
    $scope.status.isopen = !$scope.status.isopen;
  };

  
  
  $scope.tabs = [
    { title:'Recommended Books', content:'Recommended Books' },
    { title:'Subscription Plans', content:'Subscription Plans', disabled: true },
	{ title:'My Account', content:'My Account' }
  ];

  $scope.alertMe = function() {
    setTimeout(function() {
      alert('You\'ve selected the history tab!');
    });
  };
  
});