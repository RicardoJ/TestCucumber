Feature: Buscar un video en youtube para compartirlo en alguna red social

  Scenario: Buscar un video  'señora de madrugada'
    Given el usuario esta en la pagina de youtube
    When busca el video 'señora de madrugada', click en el video, click en share , click en la red social, cambia de pestaña
    When agrega en gmail el correo 'correo' y la contraseña 'contraseña',click en Log In		
    Then el usuario debe ver que el video compartido diga 'Your Tweet has been posted'

 