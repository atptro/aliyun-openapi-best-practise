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

    $start = AlibabaCloud::ecs()
                         ->v20140526()
                         ->startInstance()
                         ->withInstanceId('id')
                         ->request();

    $stop = AlibabaCloud::ecs()
                        ->v20140526()
                        ->stopInstance()
                        ->withInstanceId('id')
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