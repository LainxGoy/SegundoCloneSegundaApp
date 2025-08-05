# SegundaApp - Aplicación de Login

Una aplicación Android sencilla y elegante de login con un diseño moderno y funcional.

## Características

- 🎨 **Diseño moderno**: Interfaz limpia y atractiva con Material Design
- 📱 **Responsive**: Se adapta a diferentes tamaños de pantalla
- 🔐 **Validación de campos**: Verificación de entrada de datos
- 👤 **Simulación de login**: Funcionalidad completa de autenticación
- 💾 **Recordar sesión**: Opción para mantener la sesión activa
- 🖼️ **Imágenes personalizadas**: Usa las imágenes `inicio_salar.png` y `postal_salar.png`

## Cómo usar

### Credenciales de prueba
- **Usuario**: `admin`
- **Contraseña**: `123456`

### Funcionalidades
1. **Login**: Ingresa las credenciales y presiona "Iniciar Sesión"
2. **Validación**: La app valida que los campos no estén vacíos y la contraseña tenga al menos 6 caracteres
3. **Recordar sesión**: Marca la casilla para simular el guardado de la sesión
4. **Enlaces**: Los enlaces "¿Olvidaste tu contraseña?" y "Regístrate aquí" están preparados para futuras funcionalidades

## Estructura del proyecto

```
app/src/main/
├── java/com/example/segundaapp/
│   └── MainActivity.java          # Lógica principal de la aplicación
├── res/
│   ├── drawable/
│   │   ├── inicio_salar.png       # Imagen de fondo
│   │   └── postal_salar.png       # Logo principal
│   ├── layout/
│   │   └── activity_main.xml      # Interfaz de usuario
│   └── values/
│       ├── colors.xml             # Definición de colores
│       └── strings.xml            # Textos de la aplicación
```

## Tecnologías utilizadas

- **Android SDK**: Framework principal
- **Material Design**: Componentes de UI modernos
- **ConstraintLayout**: Layout flexible y responsive
- **CardView**: Contenedor elegante para el formulario
- **TextInputLayout**: Campos de entrada con validación

## Personalización

### Cambiar credenciales
Edita el método `validateCredentials()` en `MainActivity.java`:

```java
private boolean validateCredentials(String username, String password) {
    // Cambia aquí las credenciales válidas
    return username.equals("tu_usuario") && password.equals("tu_contraseña");
}
```

### Cambiar imágenes
Reemplaza las imágenes en `app/src/main/res/drawable/`:
- `inicio_salar.png` - Imagen de fondo
- `postal_salar.png` - Logo principal

### Cambiar colores
Edita `app/src/main/res/values/colors.xml` para personalizar la paleta de colores.

## Compilación y ejecución

1. Abre el proyecto en Android Studio
2. Sincroniza las dependencias de Gradle
3. Conecta un dispositivo Android o inicia un emulador
4. Presiona "Run" (▶️) para compilar y ejecutar la aplicación

## Próximas mejoras

- [ ] Integración con API real de autenticación
- [ ] Pantalla de registro de usuarios
- [ ] Recuperación de contraseña
- [ ] Biometría (huella digital)
- [ ] Modo oscuro
- [ ] Animaciones de transición

---

Desarrollado con ❤️ para Android 