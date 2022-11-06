# Maven project base

A common template repository that I use for the base of Maven projects.

Feel free to use it if you want. This project uses the Unlicense, so you can
do what you want with it and change the license for derived projects.

## Features

- Includes AssertJ, JUnit, SLF4J, and Mockito by default.
- Implements Checkstyle (using Google code style by default; uses Checkstyle v10).
- Implements license header enforcement.
- Provides a basic build pipeline:
    - Tests,
    - Checkstyle and License enforcement,
    - Dependabot,
    - Provides initial config for Sonatype Lift,
    - Provides initial config for Codecov.
- Provides a default `.editorconfig` and `.gitignore`.
- Implements Maven Wrapper.
- Uses a visual test reporter for Surefire.
- Configures JARs with default metadata, and seals any JARs created.
- Implements JaCoCo coverage reporting.
- Provides the newest JAR, Compiler, and Surefire plugins (JPMS-compatible).
- Encodes the module version into any compiled module descriptors.

## Stuff to do before you use this:

1. Clone the repo.
2. Change the group ID.
3. Change the artifact ID.
4. Replace the LICENSE.txt with your appropriate project license.
5. Update `.mvn/license/license-header.txt` with the desired license header.
6. Update the license name in the POM.
7. Update the organisation and project URLs in the POM.

Additionally, you may wish to:

- Change the initial version (optional).
- Change the Java Version in the POM if desired.
- If you do not need SLF4J/JUnit/AssertJ/Mockito, remove those dependencies.
- Update .editorconfig appropriately for your project.
- Update .gitconfig appropriately for your project.

## Stuff to do once you have pushed the first commit:

- [Register the project with Sonatype Lift](https://lift.sonatype.com/)
- [Register the project with Codecov](https://codecov.io/)
