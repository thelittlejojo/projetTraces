var viewStat=angular.module('viewStat',[]);

var viewStatCtrl= viewStat.controller('viewStatCtrl', function($scope){

	$scope.students = [
		{'prenom': 'santos', 'nom': 'Manning' },
		{'prenom': 'santos1', 'nom': 'Manning4' },
		{'prenom': 'santos2', 'nom': 'Manning5' },
		{'prenom': 'santos3', 'nom': 'Manning6' }	
	];
});

var MainCtrl = function ($scope) {
    $scope.title = "Boucle sur un objet javascript"
    $scope.users = [
        {name:'Sébastien',age:21},
        {name:'Marion',age:24},
        {name:'Laura',age:25},
        {name:'Morgan',age:23}
    ];
};
