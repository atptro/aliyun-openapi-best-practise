<?php
require_once '../vendor/autoload.php';

use AlibabaCloud\Client\AlibabaCloud;
use AlibabaCloud\Client\Exception\ClientException;
use AlibabaCloud\Client\Exception\ServerException;

AlibabaCloud::accessKeyClient(
    \getenv('ACCESS_KEY_ID'),
    \getenv('ACCESS_KEY_SECRET')
)->regionId('cn-hangzhou')->asDefaultClient();

try {
    $resutl1 = AlibabaCloud::rds()
                           ->v20140815()
                           ->createDBInstance()
                           ->withPayType('Postpaid')
                           ->withSecurityIPList('10.23.12.27/25')
                           ->withDBInstanceNetType('Internet')
                           ->withDBInstanceStorage('20')
                           ->withDBInstanceClass('rds.mysql.t1.small')
                           ->withEngineVersion('5.6')
                           ->withEngine('MySQL')
                           ->request();

    $resutl2 = AlibabaCloud::rds()
                           ->v20140815()
                           ->describeDBInstances()
                           ->request();
} catch (ClientException $e) {
    // Print the error message
    echo $e->getErrorMessage() . PHP_EOL;
} catch (ServerException $e) {
    // Print the error message
    echo $e->getErrorMessage() . PHP_EOL;
    // Print the RequestId
    echo $e->getRequestId() . PHP_EOL;
}