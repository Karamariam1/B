Quelles sont les architectures de systèmes parallèles ? SI, SD, MI, MD

Quelle sont les deux méthodes pour créer un thread en Java ? Implémenter l'interface Runnable et Étendre la classe Thread

L'interface Runnable - qu'est-ce qu'il contient comme méthode ? run()

Différents états du cycle de vie d'un thread ?
B. NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED

Quelle est l'exclusion mutuelle et la différence entre Dekker et Peterson ? Dekker est spécifique à deux threads, Peterson est plus général.

6- Quelle méthode permet de bloquer les threads jusqu'à l'appel d'une méthode notify() ? wait()

7- Bloquer le thread pour une période déterminée : Faux
8- La méthode join() sert à :
C. Attendre la fin de l'exécution d'un autre thread.

9- Comment éviter que les données partagées soient rompues dans un environnement
multithread ?
A. Utiliser des méthodes synchronisées

10- Pour échanger la priorité d'un thread, on utilise la méthode :
A. setPriority()

11- C'est quoi le problème de l'incrémentation sans synchronisation ? Les threads peuvent accéder simultanément à la ressource.

12- Quelle méthode permet de vérifier si un thread est en cours d'exécution ?
A. isAlive()

13- Quelle est la différence entre run() et start() ? start() crée un nouveau thread, run() l'exécute directement.

14- Comment créer un thread en utilisant l'interface Runnable ? Implanter la méthode run() et passer l'objet à un thread.
1. Qu'est-ce qu'un Mutex ?
A. Un mécanisme pour gérer l'accès concurrent à une ressource partagée

. Quelle est la différence entre les algorithmes de Dekker et Peterson ?Les threads de Dekker sont altruistes et ceux de Peterson sont égoïstes

Quelles sont les différentes architectures de systèmes parallèles ?
C. SI (Single Instruction), SD (Single Data), MI (Multiple Instruction), MD (Multiple Data)

Quelles sont les méthodes pour créer un thread en Java ?
B. Étendre la classe Thread ou implémenter l'interface Runnable

Quelle est la méthode principale de l'interface Runnable ?run()

Quels sont les différents états du cycle de vie d'un thread ?
A. NEW, RUNNABLE, BLOCKED, WAITING, TERMINATED

7. Quelles sont les transitions possibles entre les états d'un thread ?

B. RUNNABLE ↔ WAITING, BLOCKED → TERMINATED

8. Quel est le rôle de la méthode join() ?
o B. Attendre la fin de l'exécution d'un autre thread

9. Quel est le rôle de la méthode wait() ?
Bloquer un thread jusqu'à l'appel de la méthode notify()

10. Quelle est la méthode pour changer la priorité d'un thread ?
B. setPriority()

11. Que signifie un "deadlock" ?
C. Un blocage mutuel de deux ou plusieurs threads attendant des ressources

12. Quelle est la différence entre wait() et sleep() ?
B. wait() ne libère pas le verrou, sleep() le libère

13. Que permet la synchronisation dans le contexte des threads ? Contrôler l'accès aux ressources partagées pour éviter les conflits
