# Expected outcomes — bump-it wrapper

Baseline expectations updated 2026-10-10 for supply-chain 0.3.0.

| Case | Files | bump-it | secure-it | Acceptance |
|---|---|---|---|---|
| Wrapper routine | gradlew, gradlew.bat, gradle/wrapper/gradle-wrapper.jar, gradle/wrapper/gradle-wrapper.properties | From 9.7.1, choose the highest eligible aged stable non-broken Gradle release under the live advisory snapshot. Replace all four tool-generated files and verify official checksums and executable mode. | No Gradle-wrapper remediation mechanism; no A/B/C project-dependency case is seeded here. | ./gradlew check --no-daemon passes. Wrapper bytes/modes match the plan's generated files. Any Gradle verification uses a reference with the planned wrapper overlay. |
| Historical target | Same files | 9.8.0 was selected on 2026-10-07; this is historical evidence, not a fixed current target. Re-evaluate 9.8.1's official release age on the actual run date. | No fixed security unit expected. | Do not freeze selection to the older historical target after a newer eligible release ages. |

This fixture remains dependency-free and has no supply-chain gate workflow.
Do not add npm or Gradle module dependencies merely to accommodate carrier or
parent remediation tests. Retain the selected catalog release, plan, generated
wrapper hashes/modes, verification and CI evidence.
