<?php

require_once '../vendor/autoload.php';

AlibabaCloud::accessKeyClient(
    \getenv('ACCESS_KEY_ID'),
    \getenv('ACCESS_KEY_SECRET')
)->regionId('cn-hangzhou')->asDefaultClient();

try {

    $resutl  = AlibabaCloud::ecs()
                           ->v20140526()
                           ->createDisk()
                           ->withZoneId('id')
                           ->withSize('size')
                           ->withDiskCategory('diskCategory')
                           ->request();
    $resutl2 = AlibabaCloud::ecs()
                           ->v20140526()
                           ->attachDisk()
                           ->withInstanceId('id')
                           ->withDiskId('id')
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