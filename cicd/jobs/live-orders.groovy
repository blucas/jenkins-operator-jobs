#!/usr/bin/env groovy

multibranchPipelineJob('live-orders') {
    branchSources {
        git {
            remote('https://github.com/blucas/live-orders.git')
            //credentialsId('github-ci')
            //includes('JENKINS-*')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
