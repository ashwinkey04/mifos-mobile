//
//  ViewController.swift
//  mifos-mobile
//
//  Created by Ashwin on 19/08/20.
//  Copyright © 2020 Mifos Initiative. All rights reserved.
//

import UIKit
import SharedCode

class ViewController: UIViewController {
    override func viewDidLoad() {
        super.viewDidLoad()
        
        let label = UILabel(frame: CGRect(x: 0, y: 0, width: 600, height: 30))
        label.center = CGPoint(x: 250, y: 100)
        label.textAlignment = .center
        label.font = label.font.withSize(25)
        label.text = CommonKt.createApplicationScreenMessage()
        view.addSubview(label)
    }
}
