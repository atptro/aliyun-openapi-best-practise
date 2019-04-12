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
    $resutl  = AlibabaCloud::slb()
                           ->v20140515()
                           ->createLoadBalancer()
                           ->request();
    $resutl2 = AlibabaCloud::slb()
                           ->v20140515()
                           ->addBackendServers()
                           ->withLoadBalancerId('')
                           ->withBackendServers('')
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