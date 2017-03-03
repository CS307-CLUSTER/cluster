'use strict';

/**
 * @ngdoc function
 * @name yapp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of yapp
 */
angular.module('yapp')
  .controller('ClustersCtrl', function ($scope, $http) {
    $http.get('/cluster/getAll')
      .then(function(response) {
        $scope.groups = response.data;
      });
  }

  .controller('ClusterCreationCtrl', function ($scope, $http) {

    var formData = {
      restaurant: "default",
      maxUsers: "default",
      minUsers: "default",
      endTime: "default",
      address1: "default",
      address2: "default",
      city: "default",
      state: "default",
      zip: "default"
    };

    $scope.submit = function () {
      formData = $scope.form;
      $location.path('/dashboard');
      var url = ('/cluster/create?maxUsers=' + formData.maxUsers + '&minUsers=' + formData.minUsers + '&startTime='
      + formData.startTime + '&endTime=' + formData.endTime + '&address=' + formData.address1 + '&city='
      + formData.city + '&state=' + formData.state + '&zip=' + formData.zip);
      console.log(url);
      $http.get(url).success(function (response) {
        console.log(response);
      }).error(function () {
        console.log('Could not create cluster');
      });
      return false;
    }
  }));




