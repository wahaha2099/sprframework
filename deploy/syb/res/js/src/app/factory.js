define(["app"],function(app){app.factory('promiseLoad',['$q','$timeout','$log',function($q,$timeout,$log){var standardDelay=0;return{success:function(){var defer=$q.defer();$timeout(function(){defer.resolve({msg:'SUCCESS'});},standardDelay);return defer.promise;},error:function(){var defer=$q.defer();$timeout(function(){defer.reject({msg:'ERROR'});},standardDelay);return defer.promise;},endless:function(){var defer=$q.defer();return defer.promise;}};}]);});